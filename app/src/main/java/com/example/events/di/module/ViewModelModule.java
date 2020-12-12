package com.example.events.di.module;

import androidx.lifecycle.ViewModelProvider;

import com.example.events.util.ViewModelFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

    /*@Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    abstract ViewModel bindoginViewModel(LoginViewModel loginViewModel);*/


}

