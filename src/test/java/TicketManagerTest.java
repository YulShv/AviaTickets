import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    Ticket ticket1 = new Ticket(1, 12_000, "GOJ","DME", 110);
    Ticket ticket2 = new Ticket(2, 5_000, "VKO","PEZ", 120);
    Ticket ticket3 = new Ticket(3, 7_490, "GOJ","DME", 120);
    Ticket ticket4 = new Ticket(4, 5_300, "VKO","KZN", 135);
    Ticket ticket5 = new Ticket(5, 8_240, "MRV","PEZ", 142);
    Ticket ticket6 = new Ticket(6, 9_640, "GOJ","DME", 132);
    Ticket ticket7 = new Ticket(7, 8_640, "GOJ","DME", 113);
    Ticket ticket8 = new Ticket(8, 8_020, "MMK","SVO", 120);
    Ticket ticket9 = new Ticket(9, 7_100, "GOJ","DME", 112);
    Ticket ticket10 = new Ticket(10, 9_040, "MRV","PEZ", 135);

    @Test
    public void shouldFindTicketsAndSortByPrice() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] expected = { ticket9, ticket3, ticket7, ticket6, ticket1 };
        Ticket[] actual = manager.searchBy("GOJ", "DME");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindTwo() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] expected = { ticket5, ticket10 };
        Ticket[] actual = manager.searchBy("MRV", "PEZ");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindOne() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] expected = { ticket4 };
        Ticket[] actual = manager.searchBy("VKO", "KZN");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNothing() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] expected = { };
        Ticket[] actual = manager.searchBy("MRV", "DME");

        Assertions.assertArrayEquals(expected, actual);
    }

}
