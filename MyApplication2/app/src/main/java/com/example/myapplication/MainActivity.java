package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Islamic App");
    }
    public void v1(View v){
        Intent i = new Intent(this,MainActivity3.class);
        String[] body = {" ننوي الوضوء ونقول بعدها (بسم الله)","غسل الكف 3 مرات في الوضوء","المضمضة 3 مرات في الوضوء","الاستنشاق بالانف 3 مرات في الوضوء","غسل الوجه 3 مرات الوضوء","غسل اليدين للمرافق 3 ","مسح الرأس مرة واحدة في الوضوء «ويمكن ثلاثا»","مسح الأذن مرة واحدة في الوضوء على أن نبدأ باليمنى (ويمكن ثلاثا)", "غسل القدمين إلى الكعبين 3 مرات في الوضوء " };
        i.putExtra("body", body);
        i.putExtra("head", "الوضوء");
        i.putExtra("pic", 1);
        startActivity(i);
    }
    public void v2(View v){
        Intent i = new Intent(this,MainActivity2.class);
        String[] title = {"اولا","ثانيا","ثالثا","رابعا","خامسا","سادسا","سابعا", "ثامنا", "تاسعا" ,"عاشرا", "احد عشر","اثنا عشر"," ثلاثة عشر","اربعة عشر"};
        String[] body = {"القيام في الفرض على القادر","تكبيرة الإحرام وهي (الله أكبر)","قراءة الفاتحة","الركوع وأقله أن ينحني بحيث يمكنه مس ركبتيه بكفيه، وأكمله أن يمد ظهره مستويا ويجعل رأسه حياله","الرفع من الركوع","الاعتدال قائما",
                "السجود وأكمله تمكين جبهته وأنفه وكفيه وركبتيه وأطراف أصابع قدميه من محل سجوده. وأقله وضع جزء من كل عضو","الرفع من السجود", "الجلوس بين السجدتين. وكيف جلس كفى، والسنة أن يجلس مفترشا على رجله اليسرى وينصب اليمنى ويوجهها إلى القبلة" ,
                "الطمأنينة وهي السكون في كل ركن فعلي" ,"التشهد الأخير","الجلوس للتشهد الأخير وللتسليمتين",
                "التسليمتان وهو أن يقول مرتين: السلام عليكم ورحمة الله، ويكفي في النفل تسليمة واحدة، وكذا في صلاة الجنازة","ترتيب الأركان كما ذكرنا، فلو سجد مثلا قبل ركوعه عمدا بطلت صلاته، وسهواً لزمه الرجوع ليركع ثم يسجد"};
        i.putExtra("title", title);
        i.putExtra("body", body);
        i.putExtra("head", "اركان الوضوء");
        i.putExtra("pic", 0);
        startActivity(i);
    }

    public void v3(View v){
        Intent i = new Intent(this,MainActivity2.class);
        String[] title = {"قبل الفجر","قبل الظهر","بعد الظهر","بعد المغرب","بعد العشاء"};
        String[] body = {"ركعتان","أربع ركعات","ركعتان","ركعتان","ركعتان"};
        i.putExtra("title", title);
        i.putExtra("body", body);
        i.putExtra("head", "النوافل");
        i.putExtra("pic", 0);
        startActivity(i);
    }
    public void v4(View v){
        Intent i = new Intent(this,MainActivity3.class);
        String[] body = {"تأكد من أن المحيط طاهر وخالي من النجاسات. وهذا يشمل جسدك وملابسك، ومكان الصلاة نفسه"," القِبلة هي المكان الذي يتوجه إليه المسلمون أثناء الصلاة وهي ناحية الكعبة","هناك خمس صلوات في أوقات محددة يوميًا، ولكل صلاة وقت محدد يجب أداؤها خلاله","","قبل بدء الصلاة، يجب أن تفهم وتدرك مفهوم النية، فليس بالضرورة أن تكون النية بصوت عال، ولكنها يجب أن تنبع من القلب","إرفع يديك مضمومتي الاصابع حتى أذنيك وقُل بصوتٍ معتدل(الله اكبر)","قم بوضع يدك اليمنى على اليسرى وكلتاهما تحت صدرك واجعل عينيك ناظرة دومًا إلى موضع سجودك . لا تنظر حولك","ثناء الركوع، قل \"الله أكبر\". قم بالانحناء بحيث يكون ظهرك ورقبتك على مستوى احد في مواجهة الأرض، وعيناك موجهتان نحو الأرض. يجب أن يصنع كل من عينيك وظهرك زاوية مقدارها 90 درجة مع قدميك",
                "ارفع يديك إلى أذنيك وقل \"سمع الله لمن حمد\" فإذا اعتدلت قائما قل \"ربنا ولك الحمد\"","اسجد وضع يديك ورأسك وركبتيك على الأرض. هذا الوضع يسمى \"السجود\". أثناء قيامك بالسجود، قل \"الله أكبر\"","ضع قدمك اليسرى من الركبة إلى الكعب على الأرض، في حين يجب أن تكون أصابع قدمك اليمنى فقط على الأرض. ضع يديك في وضع مستوي على ركبتيك","قف وقل \"الله أكبر\". بهذا أكملت ركعة واحدة بالفعل، وبناء على ميقات الصلاة، عليك أن تكمل ثلاثة ركعات أو أكثر",""};
        i.putExtra("body", body);
        i.putExtra("head", "وضع الصلاة");
        i.putExtra("pic", 2);
        startActivity(i);
    }

    public void v5(View v){
        Intent i = new Intent(this,MainActivity2.class);
        String[] title = {"","","","",""};
        String[] body = {"أَصبَحْنا على فِطرةِ الإسلامِ، وعلى كَلِمةِ الإخلاصِ، وعلى دِينِ نَبيِّنا محمَّدٍ صلَّى اللهُ عليه وسلَّمَ، وعلى مِلَّةِ أبِينا إبراهيمَ، حَنيفًا مُسلِمًا، وما كان مِنَ المُشرِكينَ",
                "بسمِ اللهِ الذي لا يَضرُ مع اسمِه شيءٌ في الأرضِ ولا في السماءِ وهو السميعُ العليمِ" ,
                "سبحانَ اللَّهِ وبحمدِه لا قوَّةَ إلَّا باللَّهِ/ ما شاءَ اللَّهُ كانَ وما لم يشأ لم يَكن/ أعلمُ أنَّ اللَّهَ على كلِّ شيءٍ قديرٌ وأنَّ اللَّهَ قد أحاطَ بِكلِّ شيءٍ علمًا",
                "اللَّهمَّ بِكَ أصبَحنا، وبِكَ أمسَينا، وبِكَ نحيا وبِكَ نموتُ وإليكَ المصيرُ، وإذا أمسَى فليقُلْ: اللَّهمَّ بِكَ أمسَينا وبِكَ أصبَحنا وبِكَ نحيا وبِكَ نموتُ وإليكَ النُّشورُ" ,
                "رَضيتُ باللَّهِ ربًّا، وبالإسلامِ دينًا، وبِمُحمَّدٍ رسولًا"};
        i.putExtra("title", title);
        i.putExtra("body", body);
        i.putExtra("head", "اذكار الصباح");
        i.putExtra("pic", 0);
        startActivity(i);
    }

    public void v6(View v){
        Intent i = new Intent(this,MainActivity2.class);
        String[] title = {"","","","",""};
        String[] body = {"بسمِ اللهِ الذي لا يَضرُ مع اسمِه شيءٌ في الأرضِ ولا في السماءِ وهو السميعُ العليمِ" ,
                "رَضِيتُ بِاللهِ رَبًّا، وَبِالْإِسْلَامِ دِينًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا، إِلَّا كَانَ حَقًّا عَلَى اللهِ أَنْ يُرْضِيَهُ يَوْمَ الْقِيَامَة",
                "اللَّهمَّ بِكَ أمسَينا وبِكَ أصبَحنا وبِكَ نحيا وبِكَ نموتُ وإليكَ المصير",
                "سُبْحَانَ اللهِ وَبِحَمْدِهِ، عَدَدَ خَلْقِهِ وَرِضَا نَفْسِهِ وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ",
                "اللَّهُمَّ إنِّي أمسيت أُشهِدُك، وأُشهِدُ حَمَلةَ عَرشِكَ، ومَلائِكَتَك، وجميعَ خَلقِكَ: أنَّكَ أنتَ اللهُ لا إلهَ إلَّا أنتَ، وأنَّ مُحمَّدًا عبدُكَ ورسولُك" };
        i.putExtra("title", title);
        i.putExtra("body", body);
        i.putExtra("head", "اذكار المساء");
        i.putExtra("pic", 0);
        startActivity(i);
    }
    public void v7(View v){
        Intent i = new Intent(this,MainActivity2.class);
        String[] title = {"","",""};
        String[] body = {"أشْهَدُ أن لا إله إلا الله وحْدَهُ لا شريكَ لهُ ، وأشْهَدُ أنَّ محمداً عَبدُهُ ورسُولُه","اللَّهُمَّ اجْعَلْني مِنَ التَّوَّابينَ واجْعَلْنِي من المُتَطَهِّرِينَ"
                ,"سُبْحَانَكَ اللَّهُمَّ وبَحَمْدكَ أشْهدُ أنْ لا إلهَ إلا أنْتَ أَسْتَغْفِرُكَ وأتُوبُ إِلَيْكَ"};
        i.putExtra("title", title);
        i.putExtra("body", body);
        i.putExtra("head", "اذكار ما بعد الوضوء");
        i.putExtra("pic", 0);
        startActivity(i);
    }
    public void v8(View v){
        Intent i = new Intent(this,MainActivity2.class);
        String[] title = {"","","","","","","","",""};
        String[] body = {"أَسْـتَغْفِرُ الله، أَسْـتَغْفِرُ الله، أَسْـتَغْفِرُ الله","اللّهُـمَّ أَنْـتَ السَّلامُ ، وَمِـنْكَ السَّلام ، تَبارَكْتَ يا ذا الجَـلالِ وَالإِكْـرام ","لا إلهَ إلاّ اللّهُ وحدَهُ لا شريكَ لهُ، لهُ المُـلْكُ ولهُ الحَمْد، وهوَ على كلّ شَيءٍ قَدير، اللّهُـمَّ لا مانِعَ لِما أَعْطَـيْت، وَلا مُعْطِـيَ لِما مَنَـعْت، وَلا يَنْفَـعُ ذا الجَـدِّ مِنْـكَ الجَـد" ,"سُـبْحانَ اللهِ، والحَمْـدُ لله ، واللهُ أكْـبَر" ,"لا إلهَ إلاّ اللّهُ وَحْـدَهُ لا شريكَ لهُ، لهُ الملكُ ولهُ الحَمْد، وهُوَ على كُلّ شَيءٍ قَـدير" ,"لا إلهَ إلاّ اللّهُ وحْـدَهُ لا شريكَ لهُ، لهُ المُلكُ ولهُ الحَمْد، يُحيـي وَيُمـيتُ وهُوَ على كُلّ شيءٍ قدير","اللّهُـمَّ إِنِّـي أَسْأَلُـكَ عِلْمـاً نافِعـاً وَرِزْقـاً طَيِّـباً ، وَعَمَـلاً مُتَقَـبَّلاً", "اللَّهُمَّ أَجِرْنِي مِنْ النَّار" ,"اللَّهُمَّ أَعِنِّي عَلَى ذِكْرِكَ وَشُكْرِكَ وَحُسْنِ عِبَادَتِكَ"};
        i.putExtra("title", title);
        i.putExtra("body", body);
        i.putExtra("head", "اذكار ما بعد الصلاة");
        i.putExtra("pic", 0);
        startActivity(i);
    }


}