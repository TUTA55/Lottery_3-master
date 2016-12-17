package com.example.lottery.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "check_lotterry.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME_SEARCH = "lottery";
    public static final String COL_ID_SEARCH = "_id";
    public static final String COL_NUMBER = "number";
    public static final String COL_DETAIL = "detail";

    public static final String TABLE_NAME_HISTORY = "history";
    public static final String COL_ID_HISTORY = "_id";
    public static final String COL_NAME = "name";
    public static final String COL_REWARD1 = "reward1";
    public static final String COL_F3 = "first3";
    public static final String COL_B3 = "back3";
    public static final String COL_B2 = "back2";

    private static final String SQL_CRATE_TABLE_SEARCH =
            "CREATE TABLE " + TABLE_NAME_SEARCH + "("
                    + COL_ID_SEARCH + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_NUMBER + " TEXT, "
                    + COL_DETAIL + " TEXT"
                    + ")";

    private static final String SQL_CRATE_TABLE_IMAGE =
            "CREATE TABLE " + TABLE_NAME_HISTORY + "("
                    + COL_ID_HISTORY + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_NAME + " TEXT, "
                    + COL_REWARD1 + " TEXT, "
                    + COL_F3 + " TEXT,"
                    + COL_B3 + " TEXT,"
                    + COL_B2 + " TEXT"
                    + ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CRATE_TABLE_SEARCH);
        insertInitialData(db);

        db.execSQL(SQL_CRATE_TABLE_IMAGE);
        insertInitialData1(db);
    }

    private void insertInitialData1(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();

        cv.put(COL_NAME, "งวดประจำวันที่ 16 ธันวาคม 2559");
        cv.put(COL_REWARD1, "435286");
        cv.put(COL_F3, "366 596");
        cv.put(COL_B3, "199 716");
        cv.put(COL_B2, "3 5");
        db.insert(TABLE_NAME_HISTORY, null, cv);


        cv.put(COL_NAME, "งวดประจำวันที่ 1 ธันวาคม 2559");
        cv.put(COL_REWARD1, "086069");
        cv.put(COL_F3, "513 873");
        cv.put(COL_B3, "148 450");
        cv.put(COL_B2, "7 7");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 16 พฤศจิกายน 2559");
        cv.put(COL_REWARD1, "858383");
        cv.put(COL_F3, "040 682");
        cv.put(COL_B3, "558 570");
        cv.put(COL_B2, "4 4");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 พฤศจิกายน 2559");
        cv.put(COL_REWARD1, "785438");
        cv.put(COL_F3, "824 976");
        cv.put(COL_B3, "038 752");
        cv.put(COL_B2, "8 6");

        db.insert(TABLE_NAME_HISTORY, null, cv);
        cv.put(COL_NAME, "งวดประจำวันที่ 16 ตุลาคม 2559");
        cv.put(COL_REWARD1, "571947");
        cv.put(COL_F3, "692 885");
        cv.put(COL_B3, "032 587");
        cv.put(COL_B2, "9 8");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 ตุลาคม 2559");
        cv.put(COL_REWARD1, "887102");
        cv.put(COL_F3, "194 280");
        cv.put(COL_B3, "017 458");
        cv.put(COL_B2, "3 3");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 16 กันยายน 2559");
        cv.put(COL_REWARD1, "240650");
        cv.put(COL_F3, "493 583");
        cv.put(COL_B3, "043 160");
        cv.put(COL_B2, "4 2");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 กันยายน 2559");
        cv.put(COL_REWARD1, "638684");
        cv.put(COL_F3, "334 335");
        cv.put(COL_B3, "630 669");
        cv.put(COL_B2, "6 2");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 16 สิงหาคม 2559");
        cv.put(COL_REWARD1, "254004");
        cv.put(COL_F3, "966 366");
        cv.put(COL_B3, "596 631");
        cv.put(COL_B2, "3 3");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 สิงหาคม 2559");
        cv.put(COL_REWARD1, "272932");
        cv.put(COL_F3, "538 983");
        cv.put(COL_B3, "871 472");
        cv.put(COL_B2, "5 7");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 16 กรกฏาคม 2559");
        cv.put(COL_REWARD1, "449764");
        cv.put(COL_F3, "734 552");
        cv.put(COL_B3, "952 158");
        cv.put(COL_B2, "5 5");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 กรกฏาคม 2559");
        cv.put(COL_REWARD1, "082460");
        cv.put(COL_F3, "169 609");
        cv.put(COL_B3, "302 173");
        cv.put(COL_B2, "5 3");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 16 มิถุนายน 2559");
        cv.put(COL_REWARD1, "073816");
        cv.put(COL_F3, "804 251");
        cv.put(COL_B3, "749 321");
        cv.put(COL_B2, "7 9");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 มิถุนายน 2559");
        cv.put(COL_REWARD1, "511825");
        cv.put(COL_F3, "775 111");
        cv.put(COL_B3, "937 880");
        cv.put(COL_B2, "1 4");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 16 พฤษภาคม 2559");
        cv.put(COL_REWARD1, "141737");
        cv.put(COL_F3, "975 382");
        cv.put(COL_B3, "268 087");
        cv.put(COL_B2, "9 8");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 2 พฤาภาคม 2559");
        cv.put(COL_REWARD1, "399459");
        cv.put(COL_F3, "238 403");
        cv.put(COL_B3, "671 046");
        cv.put(COL_B2, "0 2");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 16 เมษายน 2559");
        cv.put(COL_REWARD1, "221609");
        cv.put(COL_F3, "228 008");
        cv.put(COL_B3, "507 523");
        cv.put(COL_B2, "8 7");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 เมาายน 2559");
        cv.put(COL_REWARD1, "066720");
        cv.put(COL_F3, "546 390");
        cv.put(COL_B3, "285852");
        cv.put(COL_B2, "9 2");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 16 มีนาคม 2559");
        cv.put(COL_REWARD1, "134918");
        cv.put(COL_F3, "877 855");
        cv.put(COL_B3, "973 004");
        cv.put(COL_B2, "3 2");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 มีนาคม 2559");
        cv.put(COL_REWARD1, "439686");
        cv.put(COL_F3, "530 426");
        cv.put(COL_B3, "155 743");
        cv.put(COL_B2, "0 6");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 16 กุมภาพันธ์ 2559");
        cv.put(COL_REWARD1, "356364");
        cv.put(COL_F3, "699 312");
        cv.put(COL_B3, "309 535");
        cv.put(COL_B2, "9 8");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 1 กุมภาพันธ์ 2559");
        cv.put(COL_REWARD1, "927800");
        cv.put(COL_F3, "625 999");
        cv.put(COL_B3, "054 076");
        cv.put(COL_B2, "0 9");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 17 มกราคม 2559");
        cv.put(COL_REWARD1, "304371");
        cv.put(COL_F3, "031 532");
        cv.put(COL_B3, "786 743");
        cv.put(COL_B2, "5 0");
        db.insert(TABLE_NAME_HISTORY, null, cv);

        cv.put(COL_NAME, "งวดประจำวันที่ 30 ธันวาคม 2558");
        cv.put(COL_REWARD1, "008217");
        cv.put(COL_F3, "246 264");
        cv.put(COL_B3, "895 596");
        cv.put(COL_B2, "0 2");
        db.insert(TABLE_NAME_HISTORY, null, cv);


    }

    private void insertInitialData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(COL_NUMBER, "435286");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 1");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "435285");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลข้างเคียงรางวัลที่ 1");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "435287");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลข้างเคียงรางวัลที่ 1");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "102788");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 2");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "114281");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 2");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "433199");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 2");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "552873");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 2");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "868604");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 2");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "172301");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "336365");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "343719");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "389749");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "453602");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "533201");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "595035");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "654238");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "717196");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "804528");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 3");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "012831");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "811564");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "752838");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "699351");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "597372");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "531903");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "168258");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "094926");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "856709");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "784547");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "700678");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "619638");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "227645");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "179428");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "096068");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "872674");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "791708");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "738614");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "344299");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "249924");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "184822");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "113052");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "894569");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "799774");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "457774");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "363301");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "320448");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "205719");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "153857");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "963014");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "494859");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "473779");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "385619");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "324279");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "225252");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "545363");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "502899");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "488004");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "402699");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "343412");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "696151");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "556797");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "507823");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "489544");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "406761");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "930445");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "747300");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "699045");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "569693");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "491982");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "530533");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 4");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "011505");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "922905");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "808822");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "694794");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "636985");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "569625");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "468643");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "400205");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "264232");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "234581");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "103657");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "991732");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "238498");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "270438");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "409920");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "498751");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "591251");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "659446");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "702932");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "829001");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "927038");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "028372");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "123253");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "242868");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "132020");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "039500");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "931353");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "832525");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "749186");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "660860");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "598869");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "508877");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "417963");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "279545");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "300115");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "250616");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "144940");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "065139");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "936786");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "836261");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "757785");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "662450");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "602654");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "521760");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "419659");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "436138");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "311700");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "253880");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "146404");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "067030");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "949892");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "846804");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "762237");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "664360");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "609108");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "537068");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "544540");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "437405");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "327445");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "255554");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "160836");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "069983");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "960940");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "888730");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "766007");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "668216");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "615650");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "618439");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "555602");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "443282");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "353483");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "255583");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "170905");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "079839");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "961966");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "906338");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "773351");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "678496");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "682868");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "624082");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "559594");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "452924");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "369784");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "257313");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "192289");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "080975");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "977682");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "918617");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "794695");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "801164");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "694707");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "627350");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "562740");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "464528");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "384193");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "262221");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "204189");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "102747");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "983987");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

        cv.put(COL_NUMBER, "919505");
        cv.put(COL_DETAIL, "ยินดีด้วย คุณถูกรางวัลที่ 5");
        db.insert(TABLE_NAME_SEARCH, null, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
