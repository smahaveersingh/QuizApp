package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val qu1 = Question(
            1,
            "Who is in the Meme?",
            R.drawable.img4,
            "Trump",
            "Biden",
            "Elon",
            "Messi",
            3
        )
        questionsList.add(qu1)

        val qu2 = Question(
            2,
            "Who is in the Meme?",
            R.drawable.img5,
            "Trump",
            "Jordan",
            "McLovin",
            "Ronaldo",
            1
        )
        questionsList.add(qu2)

        val qu3 = Question(
            3,
            "Who is in the Meme?",
            R.drawable.img6,
            "Kanye West",
            "Jordan",
            "McLovin",
            "Gordan Ramsey",
            4
        )
        questionsList.add(qu3)

        val qu4 = Question(
            4,
            "Who is in the Meme?",
            R.drawable.img7,
            "Trump",
            "Jordan",
            "McLovin",
            "Ronaldo",
            2
        )
        questionsList.add(qu4)



        return questionsList
    }

}