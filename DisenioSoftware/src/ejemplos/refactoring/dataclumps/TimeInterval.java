package ejemplos.refactoring.dataclumps;

import java.time.LocalTime;

public class TimeInterval {
	private LocalTime From;
	private LocalTime To;

	
	public TimeInterval(LocalTime from, LocalTime to) {
		From = from;
		To = to;
	}

	public TimeInterval() {
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