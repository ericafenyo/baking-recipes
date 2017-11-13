/*
 * Copyright (C) 2017 Eric Afenyo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.eric.bakingrecipes.Ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.eric.bakingrecipes.Adapters.MasterListAdapter;
import com.example.eric.bakingrecipes.R;
import com.example.eric.bakingrecipes.RecipesModel;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MasterListAdapter.onItemSelectListener{
    private static final String EXTRA_INGREDIENTS = "EXTRA_INGREDIENTS";
    private static final String EXTRA_STEPS = "EXTRA_STEPS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onItemClick(int position, List<RecipesModel> recipes) {


    }
}