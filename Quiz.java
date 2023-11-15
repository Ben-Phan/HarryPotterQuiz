package MyProjects;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{

    String[] questions = {
                            "What is the name of the magical creature that can only be seen by those who have witnessed death?",
                            "What is the name of the school newspaper at Hogwarts?",
                            "Which Hogwarts house does Luna Lovegood belong to?",
                            "What magical creature is known for guarding Gringott's Bank?",
                            "What is the primary ingredient in Polyjuice potion?",
                            "What is the name of the three-headed dog guarding the trapdoor in Harry Potter and the Sorcerer's Stone?",
                            "What position does Harry play in Quidditch?",
                            "What is Hermione's cat's name?",
                            "Who is the Slytherin ghost?",
                            "What type of animal does Harry accidentally set free while they're at the zoo?",
                            "How was Hermione able to take extra lessons?",
                            "Who is manipulated into vandalizing Hogwarts with messages about the Chamber of Secrets?",
                            "Which animal is Ron afraid of?",
                            "What is Hermione’s patronus?",
                            "What creature lives in the Chamber of Secrets?",
                            "Where was Harry Potter born?",
                            "What can professor McGonagall turn into?",
                            "What is the name of the Gryffindor ghost?",
                            "Who is Harry's godfather?",
                            "What is Voldemort's real name?",
                            "What is the British term for a nonmagical person?",
                            "What is Harry's middle name?",
                            "Which incantation can levitate an object?",
                            "What did Harry do to get him temporarily expelled from Hogwarts?",
                            "When is Harry's birthday?",
                            "Who anonymously sends Harry his father's Invisibility Cloak on Christmas?",
                            "What is the name of Hagrid's boarhound dog?",
                            "Who betrays Lily and James Potter?",
                            "What potion gives good luck to those who drink it??",
                            "What class does Professor McGonagall teach?",
                            "Who does Bill Weasley marry?",
                            "How many Horcruxes did Voldemort create intentionally?",
                            "Who kills Dobby?",
                            "How many players are on a Quidditch team?",
                            "What children's book contains the story of the Deathly Hallows?",
                            "Where is the entrance to the Chamber of Secrets hidden?",
                            "What kind of magical creature is Aragog?",
                            "Which scent attracts Hermione Granger?",
                            "In Harry Potter and the Prisoner of Azkaban, where is the secret passage from Hogwarts to Honeydukes hidden?",
                            "During his first visit with Tom Riddle, what does Dumbledore have Tom take out of his wardrobe at the orphanage?",

    };

    String[][] options = {
                            {"Opal", "Thestral", "Unicorn", "Puffskein"},
                            {"The Daily Prophet", "The Daily Pamphlet", "The Daily Trumpet", "The Daily Report"},
                            {"Slytherin", "Hufflepuff", "Gryffindor", "Ravenclaw"},
                            {"A troll", "A dragon", "A spider", "A deatheater"},
                            {"A birdclaw", "A dandelion", "Human hair", "Pumpkin juice"},
                            {"Goofy", "Fang", "Cerberus", "Fluffy"},
                            {"Chaser", "Keeper", "Seeker", "Beater"},
                            {"Tom Hanks", "Crookshanks", "Garfield", "Whiskers"},
                            {"The Bloody Mary", "The Bloody Jerry", "The Bloody Charon", "The Bloody Baron"},
                            {"A snake", "A spider", "A tiger", "A penguin"},
                            {"A teleportation spell", "Individual study plan", "Time-turning necklace", "Polyjuice potion"},
                            {"Goyle", "Ginny Weasley", "Draco Malfoy", "Neville Longbottom"},
                            {"Spiders", "Snakes", "Rats", "All of them"},
                            {"A cat", "An owl", "A horse", "An otter"},
                            {"A dragon", "A basilisk", "A giant spider", "A boggart"},
                            {"London", "Hogwarts' hospital", "Godric's Hollow", "Aunt Petunia's house"},
                            {"A cat", "A mouse", "A dog", "A rabbit "},
                            {"Nearly Headless Rick", "Nearly Headless Nick", "Nearly Headless Wick", "Nearly Headless Vick"},
                            {"Professor Lupin", "Mad Eye", "Sirius Black", "Hagrid"},
                            {"Tom Marvolo Riddle", "Tom Marvolo Raddle", "Tom Marvelo Ruddle", "Tom Mervolo Reddle"},
                            {"Nomaj", "Mudblood", "Muggle", "Pleb"},
                            {"Charles", "William", "David", "James"},
                            {"Wingardium Leviosa", "Levitate", "Wingardium Leviosum", "Wingardium Levitate"},
                            {"Inflated aunt Marge", "Casted a Patronus", "Used unforgivable spell", "Damaged a Whomping Willow"},
                            {"July 31", "August 31", "May 31", "March 31"},
                            {"Hagrid", "Severus Snape", "Professor McGonagall", "Albus Dumbledore"},
                            {"Fang", "Fluffy", "Scruffy", "Norbert"},
                            {"Snape", "Moony", "Padfoot", "Wormtail"},
                            {"Felix Felicitas", "Felix Felicitatum", "Felix Felicis", "Felix Felicum"},
                            {"Defense against dark arts", "Transfiguration", "Potions", "History"},
                            {"Fleur Delacour", "Nymphadora Tonks", "Luna Lovegood", "Romilda Vane"},
                            {"Five", "Six", "Seven", "Eight"},
                            {"Severus Snape", "Draco Malfoy", "Bellatrix Lestrange", "Lucius Malfoy"},
                            {"Six", "Seven", "Eight", "Nine"},
                            {"The Tales of Bundle the Bard", "The Tales of Bart the Bard", "The Tales of Bean the Bard", "The Tales of Beedle the Bard"},
                            {"The room of requirement", "The girls'bathroom", "The Slytherin house", "The Forbidden forest"},
                            {"A thestral", "A three-headed dog", "A spider", "A basilisk"},
                            {"Freshly mown grass, mint toothpaste, and fresh parchment", "Freshly washed clothes and sea", "Freshly baked pie and cocoa", "Freshly made chamomile tea and cookies"},
                            {"In the clock tower", "In the greenhouse", "Beneath the statue of the one-eyed witch", "In the room of requirement"},
                            {"Stolen things of other children", "Stolen money", "His paintings", "His suitcase"}
    };

    char[] answers =        {
                            'B',
                            'A',
                            'D',
                            'B',
                            'C',
                            'D',
                            'C',
                            'B',
                            'D',
                            'A',
                            'C',
                            'B',
                            'A',
                            'D',
                            'B',
                            'C',
                            'A',
                            'B',
                            'C',
                            'A',
                            'C',
                            'D',
                            'A',
                            'B',
                            'A',
                            'D',
                            'A',
                            'D',
                            'C',
                            'B',
                            'A',
                            'B',
                            'C',
                            'B',
                            'D',
                            'B',
                            'C',
                            'A',
                            'C',
                            'A',
    };

    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_questions = questions.length;
    int result;
    int seconds=15;

    JFrame frame = new JFrame();
    JTextField textfield = new JTextField();
    JTextArea textarea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           seconds--;
           seconds_left.setText(String.valueOf(seconds));
           if(seconds <= 0) {
               displayAnswer();
           }
        }
    });
    public Quiz() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,1000,900);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(null);
        frame.setResizable(false);

        textfield.setBounds(0,0,1000,50);
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(233,184,36));
        textfield.setFont(new Font("Harry P", Font.BOLD, 30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);

        textarea.setBounds(0,50,1000,100);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(25,25,25));
        textarea.setForeground(new Color(233,184,36));
        textarea.setFont(new Font("Harry P", Font.BOLD, 25));
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textarea);
        scrollPane.setBounds(0, 150, 980, 300);

        buttonA.setBounds(0,160,100,100);
        buttonA.setFont(new Font("Harry P", Font.BOLD, 35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(0,260,100,100);
        buttonB.setFont(new Font("Harry P", Font.BOLD, 35));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(0,360,100,100);
        buttonC.setFont(new Font("Harry P", Font.BOLD, 35));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        buttonD.setBounds(0,460,100,100);
        buttonD.setFont(new Font("Harry P", Font.BOLD, 35));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");

        answer_labelA.setBounds(125,160,500,100);
        answer_labelA.setBackground(new Color(50,50,50));
        answer_labelA.setForeground(new Color(245,247,248));
        answer_labelA.setFont(new Font("Harry P", Font.PLAIN,30));

        answer_labelB.setBounds(125,260,500,100);
        answer_labelB.setBackground(new Color(50,50,50));
        answer_labelB.setForeground(new Color(245,247,248));
        answer_labelB.setFont(new Font("Harry P", Font.PLAIN,30));

        answer_labelC.setBounds(125,360,500,100);
        answer_labelC.setBackground(new Color(50,50,50));
        answer_labelC.setForeground(new Color(245,247,248));
        answer_labelC.setFont(new Font("Harry P", Font.PLAIN,30));

        answer_labelD.setBounds(125,460,500,100);
        answer_labelD.setBackground(new Color(50,50,50));
        answer_labelD.setForeground(new Color(245,247,248));
        answer_labelD.setFont(new Font("Harry P", Font.PLAIN,30));

        seconds_left.setBounds(450,600,100,100);
        seconds_left.setBackground(new Color(25,25,25));
        seconds_left.setForeground(new Color(255,0,0));
        seconds_left.setFont(new Font("Harry P", Font.BOLD, 60));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        
        number_right.setBounds(225, 225,200,100);
        number_right.setBackground(new Color(25,25,25));
        number_right.setForeground(new Color(25,255,0));
        number_right.setFont(new Font("Harry P", Font.BOLD,50));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);

        percentage.setBounds(225,325,200,100);
        percentage.setBackground(new Color(25,25,25));
        percentage.setForeground(new Color(25,255,0));
        percentage.setFont(new Font("Harry P", Font.BOLD,50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        frame.add(time_label);
        frame.add(seconds_left);
        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(textarea);
        frame.add(textfield);
        frame.setVisible(true);

        nextQuestion();
    }

    public void nextQuestion() {
        if(index >= total_questions) {
            results();
        }
        else {
            textfield.setText("Question " + (index + 1));
            textarea.setText(questions[index]);
            textarea.setCaretPosition(0);
            answer_labelA.setText(options[index][0]);
            answer_labelB.setText(options[index][1]);
            answer_labelC.setText(options[index][2]);
            answer_labelD.setText(options[index][3]);
            timer.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            buttonA.setEnabled(false);
            buttonB.setEnabled(false);
            buttonC.setEnabled(false);
            buttonD.setEnabled(false);

            if (e.getSource() == buttonA) {
                answer = 'A';
                if(answer == answers[index]) {
                    correct_guesses++;
                }
            }
            if (e.getSource() == buttonB) {
                answer = 'B';
                if(answer == answers[index]) {
                    correct_guesses++;
                }
            }
            if (e.getSource() == buttonC) {
                answer = 'C';
                if(answer == answers[index]) {
                    correct_guesses++;
                }
            }
            if (e.getSource() == buttonD) {
                answer = 'D';
                if(answer == answers[index]) {
                    correct_guesses++;
                }
            }
            displayAnswer();
    }
    public void displayAnswer() {
            timer.stop();

            buttonA.setEnabled(false);
            buttonB.setEnabled(false);
            buttonC.setEnabled(false);
            buttonD.setEnabled(false);

            if(answers[index] != 'A')
                answer_labelA.setForeground(new Color(255,0,0));
            if(answers[index] != 'B')
                answer_labelB.setForeground(new Color(255,0,0));
            if(answers[index] != 'C')
                answer_labelC.setForeground(new Color(255,0,0));
            if(answers[index] != 'D')
                answer_labelD.setForeground(new Color(255,0,0));

            Timer pause = new Timer(2000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    answer_labelA.setForeground(new Color(245,247,248));
                    answer_labelB.setForeground(new Color(245,247,248));
                    answer_labelC.setForeground(new Color(245,247,248));
                    answer_labelD.setForeground(new Color(245,247,248));

                    answer = ' ';
                    seconds = 15;
                    seconds_left.setText(String.valueOf(seconds));
                    buttonA.setEnabled(true);
                    buttonB.setEnabled(true);
                    buttonC.setEnabled(true);
                    buttonD.setEnabled(true);
                    index++;
                    nextQuestion();
                }
            });
            pause.setRepeats(false);
            pause.start();
    }

    public void results() {
            buttonA.setEnabled(false);
            buttonB.setEnabled(false);
            buttonC.setEnabled(false);
            buttonD.setEnabled(false);

            result = (int)((correct_guesses / (double)total_questions)*100);

            textfield.setBounds(0,0,1000,50);
            textfield.setText("RESULTS!");
            textarea.setText("");
            answer_labelA.setText("");
            answer_labelB.setText("");
            answer_labelC.setText("");
            answer_labelD.setText("");

            number_right.setText("(" +correct_guesses + "/" + total_questions + ")");
            percentage.setText(result + "%");

            frame.add(percentage);
            frame.add(number_right);
    }
}
