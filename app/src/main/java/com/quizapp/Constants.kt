package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Phát biểu nào dưới đây là đúng?",
            R.drawable.quiz_1,
            "Hình 1 là biển báo dừng lại", "Hình 2 là biển báo chỉ đường",
            "Hình 3 là biển báo đường giao nhau", "Cả A, B và C đều đúng", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Người đi bộ khi tham gia giao thông không được thực hiện các hành vi nào sau đây?",
            R.drawable.quiz_2,
            "Vượt qua dải phân cách, đu bám vào phương tiện giao thông đang chạy", "Mang vác vật cồng kềnh phải đảm bảo an toàn",
            "Gây trở ngại cho người và phương tiện tham gia giao thông đường bộ", "Tất cả các ý trên", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Theo quy định của luật giao thông đường bộ, người đủ bao nhiêu tuổi được lái xe gắn máy có dung tích xi-lanh dưới 50cm?",
            R.drawable.quiz_3,
            "Đủ 14 tuổi trở lên", "Đủ 16 tuổi trở lên",
            "Đủ 18 trở lên", "Đủ 20 tuổi trở lên", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Người điều khiển xe moto, máy kéo, xe máy chuyên dùng trên đường mà trong máu hoặc hơi thở có nồng độ cồn vượt quá bao nhiêu thì bị cấm?",
            R.drawable.quiz_4,
            "Trong máu có nồng độ cồn vượt quá 50miligam/100mililit máu hoặc 0,25miligam/1lit khí thở", "Trong máu có nồng độ cồn vượt quá 80miligam/100mililit máu hoặc 40miligam/1lit khí thở",
            "Trong máu hoặc hơi thở có nồng độ cồn", "Cả 3 trường hợp trên đều sai", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Nhười tham gia giao thông phải đi như thế nào là đúng quy tắc giao thông?",
            R.drawable.quiz_5,
            "Đi bên phải theo chiều của mình", "Đi đúng phần đường quy định",
            "Chấp nhận hệ thống đường bộ", "Tất cả các ý trên", 3
        )

        questionsList.add(que5)

        return questionsList
    }
}