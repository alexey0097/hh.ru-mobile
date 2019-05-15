package com.example.myapplication.other;

import com.example.myapplication.R;
import com.example.myapplication.objects.Resume;

import java.util.LinkedList;
import java.util.List;

public class CustomDataResume {

    public static List<Resume> getAll() {

        List<Resume> list = new LinkedList<>();

        final String abouteMe = "Я коммуникабельный, инициативный, гибкий, честный, стрессоустойчивый. Своими сильными сторонами считаю системное мышление, ориентированность на результат, хорошие управленческие навыки. Своим позитивом и энергией заряжаю команду. Не пью, не курю.";
        final String abouteEducation = "Воронежский Государственный Университет\n" +
                "РГФ, Теория и методика преподавания иностранных языков и культур, диплом.";
        final String abouteExperience = "Юридическая компания Amond & Smith Ltd\n" +
                "Россия, www.amondsmith.ru\n" +
                "\n" +
                "Услуги для бизнеса\n" +
                "\n" +
                "Консалтинговые услуги\n" +
                "Юридическое обслуживание\n" +
                "Советник управляющего партнера по вопросам информационной и юридической поддержки\n" +
                "•\tПоддержка и расширение клиентской базы \n" +
                "•\tВыстраивание взаимоотношений с новыми и действующими клиентами\n" +
                "•\tНаписание и внедрение инструкции по работе с клиентами \n" +
                "•\tАвтоматизация бизнесс-процессов";

        Resume resume1 = new Resume(1L,
                55000,
                "руб.",
                "Стюардесса",
                5,
                "среднее",
                R.drawable.photo01,
                "+79530190297",
                "stuuuudent@mail.ru",
                "Иванова",
                "Анастасия",
                "Витальевна",
                32,
                "женский",
                abouteMe,
                abouteEducation,
                abouteExperience
        );

        Resume resume2 = new Resume(2L,
                21000,
                "руб.",
                "Строитель",
                10,
                "высшее",
                R.drawable.photo02,
                "+79530190297",
                "stuuuudent@mail.ru",
                "Петров",
                "Петр",
                "Петрович",
                41,
                "мужской",
                abouteMe,
                abouteEducation,
                abouteExperience
        );

        Resume resume3 = new Resume(3L,
                34000,
                "руб.",
                "Секретарь",
                11,
                "высшее",
                R.drawable.photo03,
                "+79530190297",
                "stuuuudent@mail.ru",
                "Михайлова",
                "Инна",
                "Степановна",
                20,
                "женский",
                abouteMe,
                abouteEducation,
                abouteExperience
        );

        Resume resume4 = new Resume(4L,
                31000,
                "руб.",
                "Охранник",
                2,
                "высшее",
                R.drawable.photo04,
                "+79530190297",
                "stuuuudent@mail.ru",
                "Иванов",
                "Иван",
                "Иванович",
                20,
                "мужской",
                abouteMe,
                abouteEducation,
                abouteExperience
        );

        Resume resume5 = new Resume(5L,
                45000,
                "руб.",
                "Менеджер по персоналу",
                4,
                "высшее",
                R.drawable.photo05,
                "+79530190297",
                "stuuuudent@mail.ru",
                "Степанов",
                "Иван",
                "Иванович",
                23,
                "мужской",
                abouteMe,
                abouteEducation,
                abouteExperience
        );

        Resume resume6 = new Resume(6L,
                65000,
                "руб.",
                "Финансовый директор",
                21,
                "высшее",
                R.drawable.photo06,
                "+79530190297",
                "stuuuudent@mail.ru",
                "Степанов",
                "Иван",
                "Иванович",
                41,
                "мужской",
                abouteMe,
                abouteEducation,
                abouteExperience
        );

        Resume resume7 = new Resume(7L,
                35000,
                "руб.",
                "Заведующий хозйством",
                4,
                "высшее",
                R.drawable.photo07,
                "+79530190297",
                "stuuuudent@mail.ru",
                "Иванова",
                "Светлана",
                "Михайловна",
                35,
                "женский",
                abouteMe,
                abouteEducation,
                abouteExperience
        );

        Resume resume8 = new Resume(8L,
                25000,
                "руб.",
                "Фотограф",
                1,
                "высшее",
                R.drawable.photo08,
                "+79530190297",
                "stuuuudent@mail.ru",
                "Степанов",
                "Иван",
                "Иванович",
                21,
                "мужской",
                abouteMe,
                abouteEducation,
                abouteExperience
        );

        list.add(resume1);
        list.add(resume2);
        list.add(resume3);
        list.add(resume4);
        list.add(resume5);
        list.add(resume6);
        list.add(resume7);
        list.add(resume8);

        return list;
    }

}
