public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();

  
        System.out.println("   Building Playlist   ");
        myPlaylist.Add_Episode(1, "Java Basics", 30, "Tech");
        myPlaylist.Add_Episode(2, "AI Future", 45, "AI");
        myPlaylist.Insert(2, 3, "Business 101", 20, "Business");

        System.out.println("Total Time: " + myPlaylist.Get_Total_Listening_Time() + " mins");
        myPlaylist.Search_Category("AI");

        System.out.println("\n   Playing   ");
        myPlaylist.Play_Next_Episode();
    }
}