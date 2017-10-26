package com.teamtreehouse;

import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
	// write your code here
        Prompter prompter = new Prompter();
        String story = null;
        try {
            story = prompter.promptForStoryTemplate();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Template tmpl = new Template(story);
            prompter.run(tmpl);

    }
}
