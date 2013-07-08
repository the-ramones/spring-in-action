package competition.autodiscovery;

import java.math.BigDecimal;

/**
 *
 * @author paul
 */
public class Ticket {

    public Ticket() {
    }
    private String performance;
    private BigDecimal price;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.performance != null ? this.performance.hashCode() : 0);
        hash = 29 * hash + (this.price != null ? this.price.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ticket other = (Ticket) obj;
        if ((this.performance == null) ? (other.performance != null) : !this.performance.equals(other.performance)) {
            return false;
        }
        if (this.price != other.price && (this.price == null || !this.price.equals(other.price))) {
            return false;
        }
        return true;
    }

    public Ticket(String performance, BigDecimal price) {
        this.performance = performance;
        this.price = price;
    }
    
    public void print() {
        System.out.println("Ticket: " + this.performance + " - " + this.price + " c.i");
    }
}
