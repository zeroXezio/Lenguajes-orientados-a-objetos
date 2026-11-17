//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
#pragma once

class ISonido{
public:
    virtual void emitirSonido() = 0;
    virtual ~ISonido() = default;
};