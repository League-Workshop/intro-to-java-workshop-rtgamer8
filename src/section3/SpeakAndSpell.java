package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell mandlebrot");
		// 2. Catch the user's answer in a String
String word  = JOptionPane.showInputDialog("What is the anwser?");
		// 3. If the user spelled the word correctly, speak "correct"
if(word.equals("mandlebrot")) {
speak("correct!");
}

		// 4. Otherwise say "wrong"
else {
	speak("wrong!");
}

//1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell superman ");
		// 2. Catch the user's answer in a String
String word2  = JOptionPane.showInputDialog("What is the anwser?");
		// 3. If the user spelled the word correctly, speak "correct"
if(word2.equals("superman")) {
speak("correct!");
speak("wrong!");
// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell nonsense");
		// 2. Catch the user's answer in a String
String word3  = JOptionPane.showInputDialog("What is the anwser?");
		// 3. If the user spelled the word correctly, speak "correct"
if(word3.equals("nonsense")) {
speak("correct!");
// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell ninja");
		// 2. Catch the user's answer in a String
String word4 = JOptionPane.showInputDialog("What is the anwser?");
		// 3. If the user spelled the word correctly, speak "correct"
if(word4.equals("ninja")) {
speak("correct!");
}
}
}	}












	
		// 5. repeat the process for other words
		
	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	

}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	