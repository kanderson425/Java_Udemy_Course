package com.kyleanderson;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();




    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for(char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02e", seatNum));
                seats.add(seat);
            }
        }

    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat reqeustSeat = null;
        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestSeat = seat;
                break;
            }
        }
        if(requestSeat = null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        return requestSeat.reserve();
    }

    // for testing
    public void getSeats() {
        for (Seat seat : seeats) {
            System.out.println(seat.getSeatNumber);
        }
    }

    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }
    }


}
