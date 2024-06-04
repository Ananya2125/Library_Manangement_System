# Library Management System

## Introduction
This is a simple Library Management System built in Java. The system allows users to add, display, borrow, and return books. It demonstrates basic object-oriented programming concepts and provides a command-line interface for interacting with the system.

## Features
- Add new books to the library
- Display all books in the library
- Borrow a book from the library
- Return a borrowed book

## Project Structure
The project consists of three main classes:
- `Book.java`: Represents a book with properties like ID, title, author, and borrowed status.
- `Library.java`: Manages a collection of books and provides methods to add, display, borrow, and return books.
- `Main.java`: Contains the main method and provides a command-line interface for interacting with the library system.

## Prerequisites
- Java Development Kit (JDK) 11 or later
- An IDE or text editor (e.g., Visual Studio Code, Eclipse, IntelliJ IDEA)

## Setup and Installation
1. Clone or download the repository to your local machine.
2. Ensure JDK is installed and properly set up.
3. Open the project in your preferred IDE or text editor.

## How to Run
### Using Command Line
1. Open a terminal or command prompt.
2. Navigate to the project directory.
3. Compile the Java files:
   ```sh
   javac Main.java

  4. Run the program :
         java Main

 ---->> Using Visual Studio Code
      Open the project folder in VS Code.
      Ensure the Java Extension Pack is installed and updated.
      Open Main.java.
      Click the Run button (a green play button) in the top right corner of the editor.
      Usage
      Run the program to start the Library Management System.
      Follow the on-screen prompts to add, display, borrow, or return books.
      Example commands:
      Add a book: Enter the book title and author when prompted.
      Display books: View all books in the library.
      Borrow a book: Enter the book ID to borrow it.
      Return a book: Enter the book ID to return it.

---->> Example-
      markdown
      Copy code
      Library Management System:
      1. Add Book
      2. Display Books
      3. Borrow Book
      4. Return Book
      5. Exit
      Choose an option: 1
      Enter book title: Java Programming
      Enter book author: John Doe
      
      Library Management System:
      1. Add Book
      2. Display Books
      3. Borrow Book
      4. Return Book
      5. Exit
      Choose an option: 2
      Book{id=1, title='Java Programming', author='John Doe', isBorrowed=false}


---->> Contributing
If you would like to contribute to this project, please fork the repository and submit a pull request with your improvements.
