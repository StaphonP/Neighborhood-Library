package com.pluralsight;

public class Book {

        private int id;
        private int isbn;
        private String title;
        private boolean isCheckedOut;
        private String checkedOutTo;

        public Book() {
            this.id = 0;
            this.isbn = 0;
            this.title = "";
            this.isCheckedOut = false;
            this.checkedOutTo = "";
        }

        public Book(int id, int isbn, String title, boolean isCheckedOut,
                    String checkedOutTo) {
            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = isCheckedOut;
            this.checkedOutTo = checkedOutTo;
        }

        @Override
        public String toString() {
            return "BookClass{" +
                    "id=" + id +
                    ", isbn='" + isbn + '\'' +
                    ", title='" + title + '\'' +
                    ", isCheckedOut=" + isCheckedOut +
                    ", checkedOutTo='" + checkedOutTo + '\'' +
                    '}';
        }

        public long getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCheckedOutTo() {
            return checkedOutTo;
        }

        public void setCheckedOutTo(String checkedOutTo) {
            this.checkedOutTo = checkedOutTo;
        }

        public boolean getIsCheckedOut() {
            return isCheckedOut;
        }

        public void setCheckedOut(boolean IsCheckedOut) {
            isCheckedOut = isCheckedOut;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getIsbn() {
            return isbn;
        }

        public void setIsbn(int isbn) {
            this.isbn = isbn;
        }
        public void checkOut(String name) {
            if (!isCheckedOut) {
                isCheckedOut = true;
                checkedOutTo = name;
                System.out.println(title + " has been checked out to " + name);
            } else {
                System.out.println(title + " is already checked out");
            }
        }
        public void checkIn() {
            if (isCheckedOut) {
                isCheckedOut = false;
                checkedOutTo = null;
                System.out.println(title + " has been checked in");
            } else {
                System.out.println(title + " is not checked out");
            }
        }

    }

