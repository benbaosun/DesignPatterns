package FacadePattern;

import FacadePattern.component.*;

/**
 * @author lkmc2
 * @date 2018/9/2
 * @description 家庭影院（外观模式）
 */
public class HomeTheaterFacade {
    private Amplifier amplifier; // 扩音器
    private Tuner tuner; // 收音机
    private DvdPlayer dvdPlayer; // DVD播放器
    private CdPlayer cdPlayer; // CD播放器
    private Projector projector; // 投影仪
    private TheaterLights lights; // 剧场灯光
    private Screen screen; // 影院屏幕
    private PopcornPopper popper; // 爆米花机

    public HomeTheaterFacade(Amplifier amplifier,
                             Tuner tuner,
                             DvdPlayer dvdPlayer,
                             CdPlayer cdPlayer,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    // 开始看电影
    public void watchMovie(String movieName) {
        System.out.println("正在准备私人影院...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvdPlayer(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movieName);
    }

    // 结束看电影
    public void endMovie() {
        System.out.println("正在关闭私人影院...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
