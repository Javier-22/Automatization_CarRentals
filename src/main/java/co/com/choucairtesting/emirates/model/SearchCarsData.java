package co.com.choucairtesting.emirates.model;

public class SearchCarsData {
    private String pick_up;
    private String pick_up_date;
    private String pick_up_time;
    private String return_date;
    private String return_time;
    private String age;
    private String return_location;

    public String getPick_up() {
        return pick_up;
    }

    public void setPick_up(String pick_up) {
        this.pick_up = pick_up;
    }

    public String getPick_up_date() {
        return pick_up_date;
    }

    public void setPick_up_date(String pick_up_date) {
        this.pick_up_date = pick_up_date;
    }

    public String getPick_up_time() {
        return pick_up_time;
    }

    public void setPick_up_time(String pick_up_time) {
        this.pick_up_time = pick_up_time;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getReturn_time() {
        return return_time;
    }

    public void setReturn_time(String return_time) {
        this.return_time = return_time;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getReturn_location() {
        return return_location;
    }

    public void setReturn_location(String return_location) {
        this.return_location = return_location;
    }

    public SearchCarsData(String pick_up, String pick_up_date, String pick_up_time, String return_date, String return_time, String age, String return_location) {
        this.pick_up = pick_up;
        this.pick_up_date = pick_up_date;
        this.pick_up_time = pick_up_time;
        this.return_date = return_date;
        this.return_time = return_time;
        this.age = age;
        this.return_location = return_location;
    }
}
