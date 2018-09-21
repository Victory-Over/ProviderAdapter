package com.fanneng.android.adapter;

import com.fanneng.android.adapter.template.guess.GuessData;

import java.util.ArrayList;
import java.util.List;

/**
 * describe：
 *
 * @author ：鲁宇峰 on 2018/9/19 19：29
 *         email：luyufengc@enn.cn
 */
public class Data {
    public static List<String> bannerList;


    public static String[] iconUrl = new String[]{
            "https://pic.iqshw.com/d/file/gexingqqziyuan/touxiang/2017/08/28/d598a8b1bf2ffa589977d7e80f53f89c.jpg",
            "https://pic.iqshw.com/d/file/gexingqqziyuan/touxiang/2017/08/28/7d9109a8e3dee4227f1633863baaa7c4.jpg",
            "https://pic.iqshw.com/d/file/gexingqqziyuan/touxiang/2017/08/28/91d135fd2175b85caf67eb14bba5e05f.jpg",
            "https://pic.iqshw.com/d/file/gexingqqziyuan/touxiang/2017/08/28/da6c8ff52bbea0e83765a8a104310b87.jpg",
            "https://pic.iqshw.com/d/file/gexingqqziyuan/touxiang/2017/08/28/c456b623be37502712734f9d267a6236.jpg",
            "https://pic.iqshw.com/d/file/gexingqqziyuan/touxiang/2017/08/28/de83d2da6e518a609c07e5c0ceafd0c2.jpg",
            "https://pic.iqshw.com/d/file/gexingqqziyuan/touxiang/2017/08/28/dfb08eed327649412fbcd8e37fb06575.jpg",
            "https://pic.iqshw.com/d/file/gexingqqziyuan/touxiang/2017/08/28/d5743aa6115bf1be61bd168d10777251.jpg",
            "https://pic.iqshw.com/d/file/gexingqqziyuan/touxiang/2017/08/28/68260d930fb7ba190b9530c7709188b8.jpg"
    };

    public static String[] titles = new String[]{"天猫", "聚划算", "天猫国际", "外卖", "天猫超市", "充值中心", "飞猪旅行", "领金币", "到家", "分类"};

    public static List<String> headLines;

    public static List<GuessData> guessList;

    static {
        bannerList = new ArrayList<>();
        bannerList.add("https://img.alicdn.com/simba/img/TB1AhFnPVXXXXa.XFXXSutbFXXX.jpg_q50.jpg");
        bannerList.add("https://gw.alicdn.com/imgextra/i2/118/TB22AjYg7qvpuFjSZFhXXaOgXXa_!!118-0-yamato.jpg_q50.jpg");
        bannerList.add("https://gw.alicdn.com/imgextra/i1/34/TB2Kea5fYVkpuFjSspcXXbSMVXa_!!34-0-yamato.jpg_q50.jpg");
        bannerList.add("https://gw.alicdn.com/imgextra/i1/101/TB2Dz1ScYtlpuFjSspoXXbcDpXa_!!101-0-yamato.jpg_q50.jpg");
        bannerList.add("https://gw.alicdn.com/imgextra/i4/140/TB2lWFJgmFjpuFjSspbXXXagVXa_!!140-0-yamato.jpg_q50.jpg");
        bannerList.add("https://aecpm.alicdn.com/tps/i4/TB1pgxYJXXXXXcAXpXXrVZt0FXX-640-200.jpg_q50.jpg");

        headLines = new ArrayList<>();
        headLines.add("Github：ProviderAdapter");
        headLines.add("Author：Victory-Over");
        headLines.add("Email：466708987@qq.com");

        guessList=new ArrayList<>();
        guessList.add(new GuessData("全棉韩版田园碎花床裙四件套公主风蕾丝花边被套纯棉1.8m床上用品", "https://img.alicdn.com/bao/uploaded/i2/2171322350/TB2SqaTaNaJ.eBjSsziXXaJ_XXa_!!2171322350.jpg_250x250.jpg", 24, 23423));
        guessList.add(new GuessData("2017免烫春秋男士英伦深灰色修身职业商务正装西服套装潮男西装", "https://img.alicdn.com/bao/uploaded/i4/TB1Ke9CJpXXXXa9XpXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg", 236, 7357));
        guessList.add(new GuessData("现货 Huawei/华为 Mate 9 Pro全网通银钻灰 保时捷", "https://asearch.alicdn.com/bao/uploaded/i2/159530341092325317/TB2mMMbaHBnpuFjSZFGXXX51pXa_!!0-saturn_solar.jpg_250x250.jpg", 43534, 746436));
        guessList.add(new GuessData("各品牌平板修理电脑ipad维修安卓mid刷机升级固件芯片维修换屏", "https://img.alicdn.com/bao/uploaded/i3/20821802/TB2S7E9abVkpuFjSspcXXbSMVXa_!!20821802.jpg_250x250.jpg", 89, 156950));
        guessList.add(new GuessData("代写文章工作总结自我介绍竞聘演讲简报心得体会证婚词调查问卷", "https://img.alicdn.com/bao/uploaded/i1/1846357812/TB21uctkpXXXXX4XpXXXXXXXXXX_!!1846357812.jpg_250x250.jpg", 35, 8769));
        guessList.add(new GuessData("Mate9Pro现货Huawei/华为 Mate 9 Pro 6GB+128GB全网通保时捷现货", "https://img.alicdn.com/bao/uploaded/i2/TB1UypnPVXXXXXzXFXXXXXXXXXX_!!2-item_pic.png_250x250.jpg", 979, 2634634));
        guessList.add(new GuessData("莱虎秋季新款时尚休闲男士西服马夹韩版修身西装马甲背心男英伦潮", "https://img.alicdn.com/bao/uploaded/i2/TB1cA.aPFXXXXc2XFXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg", 27, 3473436));
        guessList.add(new GuessData("SXT 工作人员购买专区", "https://img.alicdn.com/bao/uploaded/i7/TB10A15PXXXXXa5XVXXYXGcGpXX_M2.SS2_250x250.jpg", 23523, 150));
        guessList.add(new GuessData("梦蔻 全棉蕾丝床笠 韩式花边布艺床裙床罩 床单 1.51.8米 多花色", "https://img.alicdn.com/bao/uploaded/i4/TB1ZQjAJFXXXXXEXFXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg", 26, 7346443));
        guessList.add(new GuessData("三星c5正品Samsung/三星 Galaxy C5 SM-C5000 C7000 全网通4G手机", "https://img.alicdn.com/bao/uploaded/i1/TB1sDqKLXXXXXanXXXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg", 2634, 34637));
        guessList.add(new GuessData("全棉韩版田园碎花床裙四件套公主风蕾丝花边被套纯棉1.8m床上用品", "https://img.alicdn.com/bao/uploaded/i2/2171322350/TB2SqaTaNaJ.eBjSsziXXaJ_XXa_!!2171322350.jpg_250x250.jpg", 24, 23423));
        guessList.add(new GuessData("2017免烫春秋男士英伦深灰色修身职业商务正装西服套装潮男西装", "https://img.alicdn.com/bao/uploaded/i4/TB1Ke9CJpXXXXa9XpXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg", 236, 7357));
        guessList.add(new GuessData("现货 Huawei/华为 Mate 9 Pro全网通银钻灰 保时捷", "https://asearch.alicdn.com/bao/uploaded/i2/159530341092325317/TB2mMMbaHBnpuFjSZFGXXX51pXa_!!0-saturn_solar.jpg_250x250.jpg", 43534, 746436));
        guessList.add(new GuessData("各品牌平板修理电脑ipad维修安卓mid刷机升级固件芯片维修换屏", "https://img.alicdn.com/bao/uploaded/i3/20821802/TB2S7E9abVkpuFjSspcXXbSMVXa_!!20821802.jpg_250x250.jpg", 89, 156950));
        guessList.add(new GuessData("代写文章工作总结自我介绍竞聘演讲简报心得体会证婚词调查问卷", "https://img.alicdn.com/bao/uploaded/i1/1846357812/TB21uctkpXXXXX4XpXXXXXXXXXX_!!1846357812.jpg_250x250.jpg", 35, 8769));
        guessList.add(new GuessData("Mate9Pro现货Huawei/华为 Mate 9 Pro 6GB+128GB全网通保时捷现货", "https://img.alicdn.com/bao/uploaded/i2/TB1UypnPVXXXXXzXFXXXXXXXXXX_!!2-item_pic.png_250x250.jpg", 979, 2634634));
        guessList.add(new GuessData("莱虎秋季新款时尚休闲男士西服马夹韩版修身西装马甲背心男英伦潮", "https://img.alicdn.com/bao/uploaded/i2/TB1cA.aPFXXXXc2XFXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg", 27, 3473436));
        guessList.add(new GuessData("SXT 工作人员购买专区", "https://img.alicdn.com/bao/uploaded/i7/TB10A15PXXXXXa5XVXXYXGcGpXX_M2.SS2_250x250.jpg", 23523, 150));
        guessList.add(new GuessData("梦蔻 全棉蕾丝床笠 韩式花边布艺床裙床罩 床单 1.51.8米 多花色", "https://img.alicdn.com/bao/uploaded/i4/TB1ZQjAJFXXXXXEXFXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg", 26, 7346443));
        guessList.add(new GuessData("三星c5正品Samsung/三星 Galaxy C5 SM-C5000 C7000 全网通4G手机", "https://img.alicdn.com/bao/uploaded/i1/TB1sDqKLXXXXXanXXXXXXXXXXXX_!!0-item_pic.jpg_250x250.jpg", 2634, 34637));
    }
}
