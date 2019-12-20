/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 Eduard Balovnev (bedward70)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package ru.bedward70.e.frame;

import java.awt.BorderLayout;
import java.util.Optional;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 * The class is a frame.
 *
 * @since 0.01
 * @checkstyle EmptyLinesCheck (500 lines)
 * @checkstyle ParameterNumberCheck (500 lines)
 * @checkstyle RegexpSinglelineCheck (500 lines)
 * @checkstyle ConstructorOnlyInitializesOrCallOtherConstructors (500 lines)
 */
public class Frame extends JFrame {

    /**
     * Constructor.
     *
     * @param title The title
     * @param toolbar The tool bar
     * @param panel The panel
     * @param statusbar The status bar
     */
    @SuppressWarnings("PMD.ConstructorOnlyInitializesOrCallOtherConstructors")
    public Frame(
        final String title,
        final JToolBar toolbar,
        final JPanel panel,
        final JToolBar statusbar
    ) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Optional.ofNullable(toolbar).ifPresent(t -> add(t, BorderLayout.NORTH));
        Optional.ofNullable(panel).ifPresent(this::add);
        Optional.ofNullable(statusbar).ifPresent(s -> add(s, BorderLayout.SOUTH));

        pack();
        setVisible(true);
    }
}
