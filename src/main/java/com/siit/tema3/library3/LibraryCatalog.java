package com.siit.tema3.library3;


import java.security.PublicKey;
import java.util.ArrayList;


public class LibraryCatalog {


    public static void main(String... args) {

        ArrayList<Novel> novels = new ArrayList<Novel>();
        ArrayList<Album> albums = new ArrayList<Album>();
        ArrayList<Book> books = new ArrayList<Book>();

        Novel novel1 = new Novel("Harry Potter", 550, "SF");
        novels.add(novel1);
        Novel novel2 = new Novel("Star Wars", 315, "SF");
        novels.add(novel2);

        Album album1 = new Album("Foto album", 50, "Poor");
        albums.add(album1);
        Album album2 = new Album("City by Night", 12, "Averrage");
        albums.add(album2);

        addNovelsAndAlbumsToBooks(books, novels, albums); //se adauga automat in "books" toate "novels" si "albums"
        books.remove(books.get(0));


        for (int i = 0; i <= size(books) - 1; i++) { //se printeaza automat toata colectia de "books" identificand ID astfel incat sa poata fi scoasa orice carte apoi, cu usurinta


            if (books.get(i) instanceof Novel) {
                System.out.println("The book " + books.get(i).getnewName() + " it's a novel by type " + ((Novel) books.get(i)).getType() + " ID = " + i);

            } else if (books.get(i) instanceof Album) {
                System.out.println("The book " + books.get(i).getnewName() + " it's an album, and the paper quality is " + ((Album) books.get(i)).getPaperQuality() + " ID = " + i);
            }


        }


    }


    public static int addNovelsAndAlbumsToBooks(ArrayList books, ArrayList novels, ArrayList albums) {
        int ln = novels.size();
        int la = albums.size();
        for (int i = 0; i <= la - 1; i++) {
            for (int j = 0; j <= ln - 1; j++) {
                books.add(novels.get(j));
                System.out.println(j + " " + novels.get(j).getClass());
            }
            books.add(albums.get(i));

        }
        return ln;

    }

    public static int size(ArrayList books) {
        int ll = books.size();
        return ll;
    }

    public void printAllBooks(ArrayList books, ArrayList novels, ArrayList albums) {
        int lb = books.size();

        for (int i = 0; i <= lb - 1; i++) {
            if (books.get(i).getClass() == novels.getClass()) {
                System.out.println("Cartea cu id " + (i + 1) + " este " + books.get(i).getClass().getSimpleName());
            }


        }

    }


}
