// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Playlist {
   Node head;
   Node current;

   Playlist() {
   }

   public void Add_Episode(int v1, String v2, int v3, String v4) {
      Node v5 = new Node(v1, v2, v3, v4);
      if (this.head == null) {
         this.head = v5;
         this.current = this.head;
      } else {
         Node v6;
         for(v6 = this.head; v6.next != null; v6 = v6.next) {
         }

         v6.next = v5;
      }
   }

   public void Play_Next_Episode() {
      if (this.current != null && this.current.next != null) {
         this.current = this.current.next;
         System.out.println("Playing: " + this.current.title + " (" + this.current.duration + " mins)");
      } else {
         System.out.println("End of playlist reached.");
      }
   }

   public void Delete_Episode(int v1) {
      if (this.head != null) {
         if (this.head.id == v1) {
            if (this.current == this.head) {
               this.current = this.head.next;
            }

            this.head = this.head.next;
         } else {
            Node v2 = this.head;

            Node v3;
            for(v3 = null; v2 != null && v2.id != v1; v2 = v2.next) {
               v3 = v2;
            }

            if (v2 != null) {
               if (this.current == v2) {
                  this.current = v3;
               }

               v3.next = v2.next;
            }

         }
      }
   }

   public void Search_Category(String v1) {
      Node v2 = this.head;
      System.out.println("Episodes in " + v1 + ":");

      for(; v2 != null; v2 = v2.next) {
         if (v2.category.equalsIgnoreCase(v1)) {
            System.out.println("- " + v2.title);
         }
      }

   }

   public int Get_Total_Listening_Time() {
      int v1 = 0;

      for(Node v2 = this.head; v2 != null; v2 = v2.next) {
         v1 += v2.duration;
      }

      return v1;
   }

   public void Insert(int v1, int v2, String v3, int v4, String v5) {
      Node v6 = new Node(v2, v3, v4, v5);
      if (v1 == 1) {
         v6.next = this.head;
         if (this.head == null) {
            this.current = v6;
         }

         this.head = v6;
      } else {
         Node v7 = this.head;

         for(int v8 = 1; v7 != null && v8 < v1 - 1; ++v8) {
            v7 = v7.next;
         }

         if (v7 != null) {
            v6.next = v7.next;
            v7.next = v6;
         }

      }
   }
}