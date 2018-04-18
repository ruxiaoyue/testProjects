package com.senthink.test.designParttern.iterator.beforeExample;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/28.
 */
public class BossClient {

    public static void main(String[] args) {
        ArrayList<IProject> projects = new ArrayList<>();
        IProject project = new ConProject("智能平台项目", 6, 100);
        projects.add(project);

        for (int i = 0; i < 10; i++) {
            IProject p = new ConProject("项目"+i, i + 5, i*100);
            projects.add(p);
        }



        for (IProject project1:projects) {
            project1.getProjectInformation();
        }

        //projects.iterator().next().getProjectInformation();
    }

    private void testIterator() {

    }
}
