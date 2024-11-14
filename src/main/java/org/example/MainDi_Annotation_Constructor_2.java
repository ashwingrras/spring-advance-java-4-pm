package org.example;

import org.example.beans_with_annotations.TextEditorConfig;
import org.example.dependency_injection.constructor.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDi_Annotation_Constructor_2
{
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();
    }
}
