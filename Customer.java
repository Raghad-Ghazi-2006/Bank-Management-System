
package lab10;
public class Customer {
    private int coustemerID;
    private String coustemername;

    public Customer() {
    }

    public Customer(int coustemerID, String coustemername) {
        this.coustemerID = coustemerID;
        this.coustemername = coustemername;
    }

    public int getCoustemerID() {
        return coustemerID;
    }

    public void setCoustemerID(int coustemerID) {
        this.coustemerID = coustemerID;
    }

    public String getCoustemername() {
        return coustemername;
    }

    public void setCoustemername(String coustemername) {
        this.coustemername = coustemername;
    }

    @Override
    public String toString() {
        return "Customer{" + "coustemerID=" + coustemerID + ", coustemername=" + coustemername + '}';
    }
    
}
