package FacadePattern;


import FacadePattern.component.*;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 家庭影院测试类
 */
public class HomeTheaterFacadeTest {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier(); // 扩音器
        Tuner tuner = new Tuner(); // 收音机
        DvdPlayer dvdPlayer = new DvdPlayer(); // DVD播放器
        CdPlayer cdPlayer = new CdPlayer(); // CD播放器
        Projector projector = new Projector(); // 投影仪
        TheaterLights lights = new TheaterLights(); // 剧场灯光
        Screen screen = new Screen(); // 影院屏幕
        PopcornPopper popper = new PopcornPopper(); // 爆米花机

        // 家庭影院
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amplifier, tuner, dvdPlayer,
                        cdPlayer, projector, lights, screen, popper);

        // 观看电影
        homeTheater.watchMovie("怦然心动");

        System.out.println("------------------------");

        // 结束电影
        homeTheater.endMovie();
    }

}