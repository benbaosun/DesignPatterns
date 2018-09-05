package CompoundPattern.ServletDemo.controller;

import CompoundPattern.ServletDemo.model.BeatModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 播放器控制器
 */
public class DJView extends HttpServlet {

    @Override
    public void init() throws ServletException {
        BeatModel beatModel = new BeatModel(); // 创建节拍模型
        beatModel.initialize(); // 初始化模型

        getServletContext().setAttribute("beatModel", beatModel); // 设置模型到上下文中
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 从上下文中获取节拍模型
        BeatModel beatModel = (BeatModel) getServletContext().getAttribute("beatModel");

        // 从请求参数中获取bpm值
        String bpm = request.getParameter("bpm");

        // 未传入bpm值，从模型中获取
        if (bpm == null) {
            bpm = beatModel.getBPM() + "";
        }

        // 从请求参数中获取是否带有set命令
        String set = request.getParameter("set");

        // set命令非空，设置bpm值到模型中
        if (set != null) {
            int bpmNumber = 90;
            bpmNumber = Integer.parseInt(bpm);
            beatModel.setBPM(bpmNumber);
        }

        // 从请求参数中获取是否带有decrease命令
        String decrease = request.getParameter("decrease");

        // decrease命令非空，设置bpm值减1
        if (decrease != null) {
            beatModel.setBPM(beatModel.getBPM() - 1);
        }

        // 从请求参数中获取是否带有increase命令
        String increase = request.getParameter("increase");

        // increase命令非空，设置bpm值加1
        if (increase != null) {
            beatModel.setBPM(beatModel.getBPM() + 1);
        }

        // 从请求参数中获取是否带有on命令
        String on = request.getParameter("on");

        // on命令非空，设置模型启动
        if (on != null) {
            beatModel.on();
        }

        // 从请求参数中获取是否带有off命令
        String off = request.getParameter("off");

        // off命令非空，设置模型关闭
        if (off != null) {
            beatModel.off();
        }

        // 设置模型到页面请求中
        request.setAttribute("beatModel", beatModel);

        // 把模型传给界面
        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/DJView.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
