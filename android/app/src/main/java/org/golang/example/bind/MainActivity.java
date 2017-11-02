/*
 * Copyright 2015 The Go Authors. All rights reserved.
 * Use of this source code is governed by a BSD-style
 * license that can be found in the LICENSE file.
 */

package org.golang.example.bind;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import hydra.Hydra;

public class MainActivity extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String greetings = "";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.mytextview);

        try
        {
            Hydra.analyse("./");
            greetings = "Success";
        }
        catch (Exception e)
        {
            greetings = e.getMessage();
        }

        mTextView.setText(greetings);
    }
}
