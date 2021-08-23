package com.soujava.vagas.views.about;

import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.soujava.vagas.views.MainLayout;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
@Tag("about-view")
@JsModule("./views/about/about-view.ts")
public class AboutView extends LitTemplate implements HasStyle {

    public AboutView() {
        addClassNames("about-view", "flex", "flex-col", "h-full", "items-center", "justify-center", "p-l",
                "text-center", "box-border");
    }
}
