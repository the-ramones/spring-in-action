package tech.util;

/**
 * Contact of a shop, buyer. Consists of a several addresses, telephone numbers,
 * e-mail addresses and company's web-sites.
 *
 * @author paul
 */
public class Contact {

    private String[] addresses;
    private String[] phones;
    private String[] emails;
    private String[] websites;

    public Contact() {
    }

    public Contact(String[] addresses, String[] phones, String[] emails, String[] websites) {
        this.addresses = addresses;
        this.phones = phones;
        this.emails = emails;
        this.websites = websites;
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public String[] getWebsites() {
        return websites;
    }

    public void setWebsites(String[] websites) {
        this.websites = websites;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Contact{addresses=");
        for (String s : addresses) {
            sb.append('(').append(s).append(')');
        }
        sb.append(", phones=");
        for (String s : phones) {
            sb.append('(').append(s).append(')');
        }
        sb.append(", emails=");
        for (String s : emails) {
            sb.append('(').append(s).append(')');
        }
        sb.append(", websites=");
        for (String s : websites) {
            sb.append('(').append(s).append(')');
        }
        sb.append('}');
        return sb.toString();
    }
}
