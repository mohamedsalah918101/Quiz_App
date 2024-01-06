package com.petra.quizapp

object Constants{
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What Country does this flag belong to?",
            R.drawable.argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1)
        questionsList.add(que1)
        // 2
        val que2 = Question(
            2,
            "What Country does this flag belong to?",
            R.drawable.australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            2)
        questionsList.add(que2)
        // 3
        val que3 = Question(
            3,
            "What Country does this flag belong to?",
            R.drawable.belguim,
            "Barbados",
            "Bangladesh",
            "Bahrain",
            "Belguim",
            4)
        questionsList.add(que3)
        // 4
        val que4 = Question(
            4,
            "What Country does this flag belong to?",
            R.drawable.brazil,
            "Brazil",
            "Belguim",
            "Bangladesh",
            "Bahrain",
            1)
        questionsList.add(que4)
        // 5
        val que5 = Question(
            5,
            "What Country does this flag belong to?",
            R.drawable.denmark,
            "Djibouti",
            "Denmark",
            "Dominica",
            "Dominican Republic",
            2)
        questionsList.add(que5)
        // 6
        val que6 = Question(
            6,
            "What Country does this flag belong to?",
            R.drawable.fiji,
            "Finland",
            "Fiji",
            "France",
            "Faroe Islands",
            2)
        questionsList.add(que6)
        // 7
        val que7 = Question(
            7,
            "What Country does this flag belong to?",
            R.drawable.germany,
            "Greece",
            "Ghana",
            "Gabon",
            "Germany",
            4)
        questionsList.add(que7)
        // 8
        val que8 = Question(
            8,
            "What Country does this flag belong to?",
            R.drawable.india,
            "Iceland",
            "India",
            "Indonesia",
            "Iran",
            2)
        questionsList.add(que8)
        // 9
        val que9 = Question(
            9,
            "What Country does this flag belong to?",
            R.drawable.kuwait,
            "Kazakhstan",
            "Kenya",
            "Kuwait",
            "Korea",
            3)
        questionsList.add(que9)
        // 10
        val que10 = Question(
            10,
            "What Country does this flag belong to?",
            R.drawable.newzland,
            "Netherlands",
            "New Zealand",
            "Nepal",
            "Nigeria",
            2)
        questionsList.add(que10)




        return questionsList
    }
}