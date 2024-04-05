package st10435366.historyappfinal

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val mainLayout = findViewById<View>(R.id.main)
        ViewCompat.setOnApplyWindowInsetsListener(mainLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //this is the decloration of varibles

        val btnSearch = findViewById<Button>(R.id.bntSearch)
        val clear = findViewById<Button>(R.id.bnt2Clear)
        val ageText = findViewById<EditText>(R.id.AgeText)
        val textView = findViewById<TextView>(R.id.textView)

        //this tells the button what to do when clicked

        btnSearch.setOnClickListener {
            val userInput = ageText.text.toString().toIntOrNull()
            //this tell the program what to do if there is no input
            if (userInput == null) {
                textView.text = "Please enter a valid age"
            } else {
                // this tells the user to only enter an age betwen 20 and 100
                // and when is is done it will out put the age that the person died at and what they did
                if (userInput < 20 || userInput > 100) {
                    textView.text = "Please enter an age between 20 and 100"
                    ageText.text.clear()
                } else {
                    val result = when (userInput) {
                        56 -> "Steve Jobs died at this age 56 and he was most known for " +
                                "Steven Paul Jobs (February 24, 1955 – October 5, 2011) was an American businessman, " +
                                "inventor, and investor best known for co-founding the technology giant Apple Inc. Jobs was also the founder of NeXT and chairman and majority " +
                                "shareholder of Pixar. He was a pioneer of the personal computer revolution of the 1970s and 1980s, " +
                                "along with his early business partner and fellow Apple co-founder Steve Wozniak."

                        68 -> "Akira Toriyama " +
                                "Died at age 68 and was a Japanese manga artist and character designer. He first achieved mainstream recognition for creating the popular manga series Dr. Slump, before going on to create Dragon Ball (his most famous work) " +
                                "and acting as a character designer for several popular video games such as the Dragon Quest series, Chrono Trigger, and Blue Dragon. Toriyama came to be regarded as one of the most important authors in the history " +
                                "of manga with his works highly influential and popular, particularly Dragon Ball, which many manga artists cite as a source of inspiration"

                        76 -> "Stephen hawking " +
                                "Died at age 76 best known for his discovery that black holes emit radiation which can be detected by special instrumentation. His discovery has made the detailed study of black holes possible. Stephen Hawking was born in Oxford, " +
                                "England on January 8, 1942. At the age of 17, he enrolled at University College, Oxford"

                        39 -> "Martin Luther King Jr " +
                                "died at age 39 He was a leader of the American civil rights movement. He organized a number of peaceful protests as head of the Southern Christian Leadership Conference, including the March on Washington in 1963. He won the Nobel Peace Prize in 1964, and, at the time, he was the youngest person to have done so."

                        52 -> "William Shakespeare " +
                                "Died at age 52 An Introduction. William Shakespeare was a renowned English poet, playwright, and actor born in 1564 in Stratford-upon-Avon. His birthday is most commonly celebrated on 23 April (see When was Shakespeare born), which is also believed to be the date he died in 1616."

                        92 -> "Rosa Parks " +
                                "Died at age 92 and was called the mother of the civil rights movement, Rosa Parks invigorated the struggle for racial equality when she refused to give up her bus seat to a white man in Montgomery, Alabama. Parks' arrest on December 1, 1955 launched the Montgomery Bus Boycott by 17,000 black citizens."

                        39 -> "Malcolm X " +
                                "Died at age 39 Malcolm X emerged as the principal spokesman of the Nation of Islam during the 1950s and early 1960s. He organized temples; founded a newspaper; and led Temple No. 7 in New York City's Harlem. Elijah Muhammad appointed him the national representative of Islam, the second most powerful position in the NOI."

                        84 -> "Thomas Edison " +
                                "One of the most famous and prolific inventors of all time, Thomas Alva Edison, he died at age 84 exerted a tremendous influence on modern life, contributing inventions such as the incandescent light bulb, the phonograph, and the motion picture camera, as well as improving the telegraph and telephone."

                        25 -> "Tupac Shakur "

                        else -> "No information available for this age."
                    }
                    textView.text = result
                }
            }
        }

        //this clears the button when you hit clear

        clear.setOnClickListener {
            ageText.text.clear()
            textView.text = ""
        }
    }
}
