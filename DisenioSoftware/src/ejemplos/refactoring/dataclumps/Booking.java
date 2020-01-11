package ejemplos.refactoring.dataclumps;

import java.time.LocalTime;

public class Booking {
	private int bookingId;
	private int roomId;
	private TimeInterval intervalo;

	public Booking(int bookingId, int roomId, LocalTime from, LocalTime to)
    {
        this.bookingId = bookingId;
        this.roomId = roomId;
        intervalo = new TimeInterval(from,to);
    }

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
 
    
}
