package com.example.myapplication200.util;

import android.content.Context;
import com.example.myapplication200.model.MenuItem;
import com.example.myapplication200.model.Shop;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public static List<Shop> getShopList(Context ctx) {
        List<Shop> shopList = new ArrayList<>();

        // 1 蛋糕店
        List<MenuItem> menu1 = new ArrayList<>();
        menu1.add(new MenuItem(1, "招牌丰收水果蛋糕", "草莓/蓝莓/芒果/鲜奶/戚风蛋糕", getResUri(ctx,"sp_01_1"), 100, 168));
        menu1.add(new MenuItem(2, "玫瑰花艺奶油蛋糕", "食用玫瑰/动物奶油/奥利奥碎", getResUri(ctx,"sp_01_2"), 80, 158));
        menu1.add(new MenuItem(3, "布朗熊卡通蛋糕", "巧克力淋面/草莓夹心/奶油霜", getResUri(ctx,"sp_01_3"), 60, 128));
        menu1.add(new MenuItem(4, "日式轻芝士蛋糕", "奶油奶酪/鸡蛋/低筋面粉", getResUri(ctx,"sp_01_4"), 120, 88));
        menu1.add(new MenuItem(5, "红丝绒裸蛋糕", "红丝绒蛋糕体/奶油奶酪霜", getResUri(ctx,"sp_01_5"), 90, 118));
        menu1.add(new MenuItem(6, "芒果千层蛋糕", "芒果果肉/可丽饼皮/淡奶油", getResUri(ctx,"sp_01_6"), 70, 138));
        menu1.add(new MenuItem(7, "黑森林蛋糕", "樱桃酒/巧克力碎/奶油", getResUri(ctx,"sp_01_7"), 80, 148));
        menu1.add(new MenuItem(8, "抹茶红豆蛋糕", "宇治抹茶/蜜红豆/奶油", getResUri(ctx,"sp_01_8"), 75, 128));
        menu1.add(new MenuItem(9, "奥利奥咸奶油蛋糕", "奥利奥碎/咸奶油/蛋糕胚", getResUri(ctx,"sp_01_9"), 95, 108));
        menu1.add(new MenuItem(10, "酸奶水果捞蛋糕", "酸奶慕斯/混合水果/脆啵啵", getResUri(ctx,"sp_01_10"), 65, 138));
        shopList.add(new Shop(1, "甜悦家蛋糕房", getResUri(ctx,"s_shop1"), 4.9, 1000, 5, "配送约2-4小时", "生日蛋糕送蜡烛+餐具 | 满198元送小蛋糕", menu1));

        // 2 咖啡西餐
        List<MenuItem> menu2 = new ArrayList<>();
        menu2.add(new MenuItem(11, "拿铁咖啡", "浓缩咖啡/全脂牛奶/奶泡", getResUri(ctx,"sp_02_1"), 200, 28));
        menu2.add(new MenuItem(12, "西冷牛排套餐", "西冷牛排/烤蔬菜/黑胡椒酱", getResUri(ctx,"sp_02_2"), 50, 128));
        menu2.add(new MenuItem(13, "意式肉酱面", "番茄肉酱/螺旋意面/帕玛森芝士", getResUri(ctx,"sp_02_3"), 80, 48));
        menu2.add(new MenuItem(14, "卡布奇诺", "浓缩咖啡/牛奶/肉桂粉", getResUri(ctx,"sp_02_4"), 180, 32));
        menu2.add(new MenuItem(15, "凯撒沙拉", "罗马生菜/面包丁/凯撒酱", getResUri(ctx,"sp_02_5"), 100, 38));
        menu2.add(new MenuItem(16, "美式咖啡", "浓缩咖啡/热水", getResUri(ctx,"sp_02_6"), 220, 22));
        menu2.add(new MenuItem(17, "蘑菇奶油汤", "口蘑/奶油/面包片", getResUri(ctx,"sp_02_7"), 70, 32));
        menu2.add(new MenuItem(18, "焦糖玛奇朵", "浓缩咖啡/焦糖/牛奶", getResUri(ctx,"sp_02_8"), 150, 36));
        menu2.add(new MenuItem(19, "T骨牛排", "T骨牛排/薯条/时蔬", getResUri(ctx,"sp_02_9"), 40, 158));
        menu2.add(new MenuItem(20, "水果松饼", "松饼/草莓/蓝莓/枫糖浆", getResUri(ctx,"sp_02_10"), 90, 45));
        shopList.add(new Shop(2, "爪哇咖啡·西餐酒吧", getResUri(ctx,"s_shop2"), 4.7, 200, 7, "配送约30-45分钟", "下午茶套餐满50元减10元 | 新用户首单8折", menu2));

        // ...（依次补齐3~10，同理，见下方样例“代码补齐助手”）
// 3. 必胜客欢乐餐厅 - 披萨快餐类
        List<MenuItem> menu3 = new ArrayList<>();
        menu3.add(new MenuItem(21, "超级至尊披萨",      "牛肉/意式香肠/蘑菇/青椒",          getResUri(ctx,"sp_03_1"), 120, 89));
        menu3.add(new MenuItem(22, "海鲜至尊披萨",      "虾仁/鱿鱼/蛤蜊/芝士",              getResUri(ctx,"sp_03_2"), 100, 99));
        menu3.add(new MenuItem(23, "新奥尔良烤翅",      "鸡翅/新奥尔良腌料",                getResUri(ctx,"sp_03_3"), 150, 32));
        menu3.add(new MenuItem(24, "榴莲忘返披萨",      "金枕榴莲/马苏里拉芝士",            getResUri(ctx,"sp_03_4"), 80, 119));
        menu3.add(new MenuItem(25, "意式肉酱千层面",    "肉酱/千层面皮/芝士",                getResUri(ctx,"sp_03_5"), 70, 59));
        menu3.add(new MenuItem(26, "鸡茸蘑菇汤",        "鸡肉/口蘑/奶油",                    getResUri(ctx,"sp_03_6"), 110, 29));
        menu3.add(new MenuItem(27, "香酥凤尾虾",        "鲜虾/面包糠/番茄酱",                getResUri(ctx,"sp_03_7"), 130, 39));
        menu3.add(new MenuItem(28, "蔬菜沙拉",          "生菜/番茄/黄瓜/沙拉酱",            getResUri(ctx,"sp_03_8"), 140, 25));
        menu3.add(new MenuItem(29, "巧克力布朗尼",      "巧克力/核桃/奶油",                  getResUri(ctx,"sp_03_9"), 90, 28));
        menu3.add(new MenuItem(30, "冰柠檬红茶",        "红茶/柠檬/糖浆",                    getResUri(ctx,"sp_03_10"), 200, 18));
        shopList.add(new Shop(3, "必胜客欢乐餐厅", getResUri(ctx,"s_shop3"), 4.5, 500, 5, "配送约20-35分钟", "外送费5元 | 披萨买一送一（指定款）", menu3));

        // 4. 艾梵创意料理 - 创意料理类
        List<MenuItem> menu4 = new ArrayList<>();
        menu4.add(new MenuItem(31, "黑松露烩饭",        "意大利米/黑松露/帕玛森芝士",        getResUri(ctx,"sp_04_1"), 60, 88));
        menu4.add(new MenuItem(32, "分子料理牛排",      "和牛/分子泡沫/蔬菜脆片",            getResUri(ctx,"sp_04_2"), 30, 198));
        menu4.add(new MenuItem(33, "法式香煎鹅肝",      "鹅肝/苹果酱/烤面包",                getResUri(ctx,"sp_04_3"), 40, 128));
        menu4.add(new MenuItem(34, "泰式冬阴功汤",      "虾/蘑菇/柠檬叶/辣椒",              getResUri(ctx,"sp_04_4"), 80, 48));
        menu4.add(new MenuItem(35, "日式刺身拼盘",      "三文鱼/金枪鱼/北极贝",              getResUri(ctx,"sp_04_5"), 50, 158));
        menu4.add(new MenuItem(36, "墨西哥鸡肉卷",      "鸡肉/番茄/生菜/墨西哥饼",          getResUri(ctx,"sp_04_6"), 100, 38));
        menu4.add(new MenuItem(37, "西班牙海鲜饭",      "虾/青口贝/藏红花/米饭",            getResUri(ctx,"sp_04_7"), 70, 78));
        menu4.add(new MenuItem(38, "印度咖喱鸡",        "鸡肉/咖喱酱/椰奶/馕",              getResUri(ctx,"sp_04_8"), 90, 58));
        menu4.add(new MenuItem(39, "韩式部队火锅",      "午餐肉/年糕/芝士/辛拉面",          getResUri(ctx,"sp_04_9"), 110, 68));
        menu4.add(new MenuItem(40, "摩洛哥塔吉锅",      "羊肉/蔬菜/香料/couscous",           getResUri(ctx,"sp_04_10"), 60, 98));
        shopList.add(new Shop(4, "艾梵创意料理", getResUri(ctx,"s_shop4"), 4.8, 150, 7, "配送约35-50分钟", "新用户立减15元 | 满200元送法式鹅肝", menu4));

        // 5. 蜀九香火锅馆 - 川式火锅类
        List<MenuItem> menu5 = new ArrayList<>();
        menu5.add(new MenuItem(41, "麻辣牛肉",          "牛里脊/辣椒面/料酒",                getResUri(ctx,"sp_05_1"), 150, 48));
        menu5.add(new MenuItem(42, "鲜毛肚",            "牛肚/冰块/蘸料",                    getResUri(ctx,"sp_05_2"), 100, 58));
        menu5.add(new MenuItem(43, "鸳鸯火锅锅底",      "麻辣汤/骨汤/香料",                  getResUri(ctx,"sp_05_3"), 80, 38));
        menu5.add(new MenuItem(44, "虾滑",              "鲜虾/淀粉/蛋清",                    getResUri(ctx,"sp_05_4"), 120, 45));
        menu5.add(new MenuItem(45, "黄喉",              "猪黄喉/盐水",                        getResUri(ctx,"sp_05_5"), 90, 35));
        menu5.add(new MenuItem(46, "酥肉",              "五花肉/面粉/花椒",                  getResUri(ctx,"sp_05_6"), 180, 28));
        menu5.add(new MenuItem(47, "鸭血",              "鸭血/盐水",                          getResUri(ctx,"sp_05_7"), 160, 18));
        menu5.add(new MenuItem(48, "金针菇",            "金针菇/清水",                        getResUri(ctx,"sp_05_8"), 200, 12));
        menu5.add(new MenuItem(49, "宽粉",              "红薯粉/开水",                        getResUri(ctx,"sp_05_9"), 170, 15));
        menu5.add(new MenuItem(50, "脑花",              "猪脑/料酒",                          getResUri(ctx,"sp_05_10"), 70, 25));
        shopList.add(new Shop(5, "蜀九香火锅馆", getResUri(ctx,"s_shop5"), 4.6, 300, 5, "配送约40-60分钟", "火锅底料免费送 | 满150元减30元", menu5));

        // 6. 寿司之神·日式料理 - 日式料理类
        List<MenuItem> menu6 = new ArrayList<>();
        menu6.add(new MenuItem(51, "三文鱼刺身",        "三文鱼/芥末/酱油",                  getResUri(ctx,"sp_06_1"), 80, 68));
        menu6.add(new MenuItem(52, "金枪鱼大腹寿司",    "金枪鱼大腹/寿司米/海苔",            getResUri(ctx,"sp_06_2"), 30, 98));
        menu6.add(new MenuItem(53, "鳗鱼饭",            "蒲烧鳗鱼/米饭/海苔",                getResUri(ctx,"sp_06_3"), 100, 58));
        menu6.add(new MenuItem(54, "北极贝刺身",        "北极贝/芥末/酱油",                  getResUri(ctx,"sp_06_4"), 70, 55));
        menu6.add(new MenuItem(55, "加州卷",            "蟹肉棒/牛油果/黄瓜/海苔",          getResUri(ctx,"sp_06_5"), 120, 38));
        menu6.add(new MenuItem(56, "味增汤",            "味增/豆腐/海带",                    getResUri(ctx,"sp_06_6"), 150, 12));
        menu6.add(new MenuItem(57, "天妇罗虾",          "鲜虾/天妇罗粉/蔬菜",                getResUri(ctx,"sp_06_7"), 90, 42));
        menu6.add(new MenuItem(58, "玉子烧寿司",        "厚蛋烧/寿司米/海苔",                getResUri(ctx,"sp_06_8"), 110, 28));
        menu6.add(new MenuItem(59, "日式炸猪排",        "猪里脊/面包糠/酱料",                getResUri(ctx,"sp_06_9"), 80, 45));
        menu6.add(new MenuItem(60, "梅酒",              "梅子/基酒/冰糖",                    getResUri(ctx,"sp_06_10"), 100, 35));
        shopList.add(new Shop(6, "寿司之神·日式料理", getResUri(ctx,"s_shop6"), 4.9, 120, 7, "配送约25-40分钟", "刺身拼盘8折 | 满180元送味增汤", menu6));

        // 7. 汉堡王·美式快餐 - 美式快餐类
        List<MenuItem> menu7 = new ArrayList<>();
        menu7.add(new MenuItem(61, "皇堡",              "牛肉饼/生菜/番茄/洋葱",            getResUri(ctx,"sp_07_1"), 200, 39));
        menu7.add(new MenuItem(62, "天椒皇堡",          "辣味牛肉饼/辣椒/芝士",              getResUri(ctx,"sp_07_2"), 180, 42));
        menu7.add(new MenuItem(63, "王道嫩香鸡块",      "鸡胸肉/面包糠/番茄酱",              getResUri(ctx,"sp_07_3"), 250, 22));
        menu7.add(new MenuItem(64, "薯条(大)",          "马铃薯/食用油/盐",                  getResUri(ctx,"sp_07_4"), 300, 15));
        menu7.add(new MenuItem(65, "洋葱圈",            "洋葱/面粉/面包糠",                  getResUri(ctx,"sp_07_5"), 220, 18));
        menu7.add(new MenuItem(66, "草莓奶昔",          "草莓/牛奶/冰淇淋",                  getResUri(ctx,"sp_07_6"), 160, 25));
        menu7.add(new MenuItem(67, "王道川香嫩牛五方",  "牛肉/青椒/面饼/酱料",              getResUri(ctx,"sp_07_7"), 150, 32));
        menu7.add(new MenuItem(68, "巧克力新地",        "冰淇淋/巧克力酱",                    getResUri(ctx,"sp_07_8"), 190, 12));
        menu7.add(new MenuItem(69, "美式咖啡(冰)",      "咖啡/水/冰块",                      getResUri(ctx,"sp_07_9"), 230, 18));
        menu7.add(new MenuItem(70, "蔬菜沙拉",          "生菜/番茄/黄瓜/沙拉酱",            getResUri(ctx,"sp_07_10"), 170, 16));
        shopList.add(new Shop(7, "汉堡王·美式快餐", getResUri(ctx,"s_shop7"), 4.3, 800, 5, "配送约15-25分钟", "皇堡套餐立减8元 | 薯条买大送小", menu7));

        // 8. 奈雪的茶·新式茶饮 - 新式茶饮类
        List<MenuItem> menu8 = new ArrayList<>();
        menu8.add(new MenuItem(71, "霸气芝士草莓",      "草莓/绿茶/芝士奶盖",                getResUri(ctx,"sp_08_1"), 200, 32));
        menu8.add(new MenuItem(72, "老佛爷霸气橙子",    "橙子/红茶/蜂蜜",                    getResUri(ctx,"sp_08_2"), 180, 28));
        menu8.add(new MenuItem(73, "软欧包·菠菜肉骨头", "菠菜面团/猪肉馅/芝士",              getResUri(ctx,"sp_08_3"), 100, 25));
        menu8.add(new MenuItem(74, "霸气玉油柑",        "玉油柑/绿茶/蜂蜜",                  getResUri(ctx,"sp_08_4"), 150, 35));
        menu8.add(new MenuItem(75, "草莓魔法棒",        "草莓/奶油/面包",                    getResUri(ctx,"sp_08_5"), 80, 28));
        menu8.add(new MenuItem(76, "金牡丹茶王",        "金牡丹茶叶/热水",                    getResUri(ctx,"sp_08_6"), 220, 22));
        menu8.add(new MenuItem(77, "奥利奥魔法棒",      "奥利奥/奶油/面包",                  getResUri(ctx,"sp_08_7"), 90, 26));
        menu8.add(new MenuItem(78, "霸气杨梅",          "杨梅/绿茶/冰糖",                    getResUri(ctx,"sp_08_8"), 170, 30));
        menu8.add(new MenuItem(79, "紫薯嘟嘟",          "紫薯/奶酪/面包",                    getResUri(ctx,"sp_08_9"), 110, 24));
        menu8.add(new MenuItem(80, "茉莉初雪",          "茉莉花茶/热水",                      getResUri(ctx,"sp_08_10"), 210, 20));
        shopList.add(new Shop(8, "奈雪的茶·新式茶饮", getResUri(ctx,"s_shop8"), 4.7, 600, 7, "配送约20-35分钟", "买茶送软欧包（指定款） | 会员积分抵现", menu8));

        // 9. 木屋烧烤·夜宵必备 - 烧烤类
        List<MenuItem> menu9 = new ArrayList<>();
        menu9.add(new MenuItem(81, "烤羊肉串",          "羊肉/孜然/辣椒面",                  getResUri(ctx,"sp_09_1"), 300, 5));
        menu9.add(new MenuItem(82, "烤鸡翅",            "鸡翅/烧烤酱/蜂蜜",                  getResUri(ctx,"sp_09_2"), 200, 8));
        menu9.add(new MenuItem(83, "烤生蚝",            "生蚝/蒜蓉/粉丝",                    getResUri(ctx,"sp_09_3"), 150, 12));
        menu9.add(new MenuItem(84, "烤茄子",            "茄子/蒜蓉/辣椒",                    getResUri(ctx,"sp_09_4"), 250, 6));
        menu9.add(new MenuItem(85, "烤玉米",            "玉米/黄油/盐",                      getResUri(ctx,"sp_09_5"), 220, 4));
        menu9.add(new MenuItem(86, "烤五花肉",          "五花肉/孜然/辣椒",                  getResUri(ctx,"sp_09_6"), 180, 6));
        menu9.add(new MenuItem(87, "烤韭菜",            "韭菜/烧烤酱/芝麻",                  getResUri(ctx,"sp_09_7"), 280, 3));
        menu9.add(new MenuItem(88, "烤鱿鱼须",          "鱿鱼须/酱油/辣椒",                  getResUri(ctx,"sp_09_8"), 160, 8));
        menu9.add(new MenuItem(89, "烤馒头片",          "馒头/黄油/蜂蜜",                    getResUri(ctx,"sp_09_9"), 300, 2));
        menu9.add(new MenuItem(90, "酸梅汤",            "酸梅/冰糖/水",                      getResUri(ctx,"sp_09_10"), 200, 10));
        shopList.add(new Shop(9, "木屋烧烤·夜宵必备", getResUri(ctx,"s_shop9"), 4.5, 700, 5, "配送约30-50分钟", "烧烤满100元减20元 | 啤酒买二送一", menu9));

        // 10 拉面店
        List<MenuItem> menu10 = new ArrayList<>();
        menu10.add(new MenuItem(91,  "经典豚骨拉面",    "豚骨汤/拉面/叉烧/笋干",           getResUri(ctx,"sp_10_1"), 120, 48));
        menu10.add(new MenuItem(92,  "辣味噌拉面",      "豚骨汤/辣味噌/叉烧/辣椒",         getResUri(ctx,"sp_10_2"), 100, 52));
        menu10.add(new MenuItem(93,  "温泉蛋",          "鸡蛋/温泉水温煮",                 getResUri(ctx,"sp_10_3"), 150, 8));
        menu10.add(new MenuItem(94,  "日式煎饺",        "饺子皮/猪肉馅/蔬菜",               getResUri(ctx,"sp_10_4"), 80, 15));
        menu10.add(new MenuItem(95,  "叉烧肉",          "五花肉/酱油/糖",                   getResUri(ctx,"sp_10_5"), 70, 12));
        menu10.add(new MenuItem(96,  "麻竹笋",          "麻竹/酱油/糖",                     getResUri(ctx,"sp_10_6"), 110, 6));
        menu10.add(new MenuItem(97,  "辣味海带",        "海带/辣椒/酱油",                   getResUri(ctx,"sp_10_7"), 130, 5));
        menu10.add(new MenuItem(98,  "杏仁豆腐",        "杏仁粉/豆腐/糖浆",                 getResUri(ctx,"sp_10_8"), 90, 10));
        menu10.add(new MenuItem(99,  "梅酒Highball",    "梅酒/苏打水/冰块",                 getResUri(ctx,"sp_10_9"), 100, 25));
        menu10.add(new MenuItem(100, "抹茶冰淇淋",      "抹茶/奶油/牛奶",                   getResUri(ctx,"sp_10_10"), 80, 12));
        shopList.add(new Shop(10, "一蘭拉面·日式豚骨", getResUri(ctx,"s_shop10"), 4.8, 200, 7, "配送约25-40分钟", "拉面加叉烧半价 | 满80元送煎饺", menu10));

        /* 其它7家按你举例格式补齐，直接复制就可，确保菜单与图片资源名正确即可 */


        return shopList;
    }

    // 资源URI
    private static String getResUri(Context ctx, String imgName) {
        int resId = ctx.getResources().getIdentifier(imgName, "drawable", ctx.getPackageName());
        return "android.resource://" + ctx.getPackageName() + "/" + resId;
    }
}




