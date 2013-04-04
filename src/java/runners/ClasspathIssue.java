package runners;

import java.util.HashSet;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.FileType;
import org.apache.commons.vfs2.VFS;

public class ClasspathIssue {

    private static HashSet< String> packageNames = new HashSet< String>();
    private static String localFilePath;

    /**
     * @param args
     * @throws Throwable
     */
    public static void main(final String[] args) throws Throwable {
        
        FileSystemManager fileSystemManager = VFS.getManager();

        String[] pathElements = System.getProperty("java.class.path").split(";");
        for (String element : pathElements) {
            if (element.endsWith("jar")) {
                FileObject fileObject = fileSystemManager.resolveFile("jar://" + element);
                addPackages(fileObject);
            } else {
                FileObject fileObject = fileSystemManager.resolveFile(element);
                localFilePath = fileObject.getName().getPath();
                addPackages(fileObject);
            }
        }
        for (String name : packageNames) {
            System.out.println(name);
        }
    }

    private static void addPackages(final FileObject fileObject) throws Throwable {
        FileObject[] children = fileObject.getChildren();
        for (FileObject child : children) {
            if (!child.getName().getBaseName().equals("META-INF")) {
                if (child.getType() == FileType.FOLDER) {
                    addPackages(child);
                } else if (child.getName().getExtension().equals("class")) {
                    String parentPath = child.getParent().getName().getPath();
                    parentPath = StringUtils.remove(parentPath, localFilePath);
                    parentPath = StringUtils.removeStart(parentPath, "/");
                    parentPath = parentPath.replaceAll("/", ".");

                    packageNames.add(parentPath);
                }
            }
        }
    }
}
