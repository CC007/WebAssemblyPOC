package com.github.cc007.webassemblypoc;

import com.github.cc007.webassemblypoc.model.Clicks;

import de.mirkosertic.bytecoder.api.web.ClickEvent;
import de.mirkosertic.bytecoder.api.web.EventListener;
import de.mirkosertic.bytecoder.api.web.Window;

public class OpaqueReferenceTest {

    public static void main(String[] args) {
        final Clicks clicks = new Clicks();
        final Window w = Window.window();
        w.document().body().innerHTML("<h1>Hello World!</h1>\n"
                + "<div>\n"
                + "  <p id=\"clickable\" style=\"border-style:solid;\">Click me!</p>\n"
                + "</div>"
        );
        w.document().getElementById("clickable").addEventListener("click", (EventListener<ClickEvent>) aValue -> {
            w.document().getElementById("clickable").textContent("Clicked " + clicks.getCount().toString(10) + " times!");
            clicks.increment();
        });
    }
}
