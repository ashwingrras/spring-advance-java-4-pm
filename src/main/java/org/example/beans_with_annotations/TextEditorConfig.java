package org.example.beans_with_annotations;

import org.example.dependency_injection.constructor.SpellChecker;
import org.example.dependency_injection.constructor.TextEditor;
import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor( spellChecker() );
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker( );
    }
}
