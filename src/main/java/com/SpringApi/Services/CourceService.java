package com.SpringApi.Services;


import java.util.List;

import com.SpringApi.entities.Cource;

public interface CourceService {

public List<Cource> GetCources();

public Cource addCource(Cource cource);
public Cource updtCource(Cource cource);
}
