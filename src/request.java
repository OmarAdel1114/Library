public class request {
 private int requestID;
 private int req_quantity;
 private double req_total_price;

    public request() {
    }

    public request(int requestID, int req_quantity, double req_total_price) {
        this.requestID = requestID;
        this.req_quantity = req_quantity;
        this.req_total_price = req_total_price;
    }

    public int getRequestID() {
        return requestID;
    }

   public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getReq_quantity() {
        return req_quantity;
    }

    public void setReq_quantity(int req_quantity) {
        this.req_quantity = req_quantity;
    }

    public double getReq_total_price() {
        return req_total_price;
    }

    public void setReq_total_price(double req_total_price) {
        this.req_total_price = req_total_price;
    }
}
