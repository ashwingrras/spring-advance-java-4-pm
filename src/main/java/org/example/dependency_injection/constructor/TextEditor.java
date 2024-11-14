package org.example.dependency_injection.constructor;

public class TextEditor
{
    private SpellChecker spellChecker;

    // constructor injection
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
