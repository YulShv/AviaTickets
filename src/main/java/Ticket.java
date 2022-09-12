public class Ticket implements Comparable<Ticket> {
    protected int id;
    protected int price;
    protected String departureAirport;
    protected String destinationAirport;
    protected int flightTime;

    public Ticket(int id, int price, String departureAirport, String destinationAirport, int flightTime) {
        this.id = id;
        this.price = price;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return  1;
        } else {
            return 0;
        }
    }
}
