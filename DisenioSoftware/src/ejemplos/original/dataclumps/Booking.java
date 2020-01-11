package ejemplos.original.dataclumps;

import java.time.LocalTime;

public class Booking {
	private int bookingId;
	private int roomId;
	private LocalTime From;
	private LocalTime To;
	
	public Booking(int bookingId, int roomId, LocalTime from, LocalTime to)
    {
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.From = from;
        this.To = to;
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

	public LocalTime getFrom() {
		return From;
	}

	public void setFrom(LocalTime from) {
		From = from;
	}

	public LocalTime getTo() {
		return To;
	}

	public void setTo(LocalTime to) {
		To = to;
	}
 
    
}
