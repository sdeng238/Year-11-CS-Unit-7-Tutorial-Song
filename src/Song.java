import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> existingListeners = new ArrayList<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    //outputs how many new listeners the song gained on that day out of all the listeners
    public int howMany(ArrayList<String> dailyListeners)
    {
        int count = 0;
        boolean exists = false;

        if (existingListeners.size() == 0)
        {
            for(int num = 0; num < dailyListeners.size(); num++)
            {
                count++;
                existingListeners.add(dailyListeners.get(num).toLowerCase());
            }
        }
        else
        {
            for(int num = 0; num < dailyListeners.size(); num++)
            {
                for(int numTwo = 0; numTwo < existingListeners.size(); numTwo++)
                {
                    if(dailyListeners.get(num).toLowerCase().equals(existingListeners.get(numTwo)))
                    {
                        exists = true;
                    }
                }

                if(!exists)
                {
                    count++;
                    existingListeners.add(dailyListeners.get(num).toLowerCase());
                }
                exists = false;
            }
        }

        return count;
    }
}
