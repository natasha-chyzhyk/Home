/**
 * Created by Stas on 07.10.2016.
 */
public abstract class Flat {
    private float totalSquare;
    private float livingSquare;
    private  Room[] rooms;

    public  Flat(){
        this.totalSquare = totalSquare;
        this.livingSquare = livingSquare;
        if(rooms != null){
            this.rooms = new Room[rooms.length];
            System.arraycopy(rooms, 0, this.rooms, 0, rooms.length);
        }else {
            this.rooms = null;
        }
    }

    public void setRooms(Room... rooms){
        // Это плохо, потому что не соответствует принципу инкапсуляции
        //this.rooms = rooms;

        if(rooms != null){
            this.rooms = new Room[rooms.length];
            System.arraycopy(rooms, 0, this.rooms, 0, rooms.length);
        }else {
            this.rooms = null;
        }
    }
    /**
     * Тоже плохо. Не соответствует принципу инкапсуляции
     * @return
     */
    public Room[] getRoom() {
        return rooms;
    }

    public Room getRoom(int index){
        if(rooms != null){
            return (index>=0 && index<rooms.length) ? rooms[index] : null;
        }else{
            return null;
        }
    }
    public  float getTotalSquare(){
        return totalSquare;
    }

    public float getLivingSquare(){
        return  livingSquare;
    }

}
