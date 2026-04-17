package com.example.EcoMarketSPA.service;

public class GeneroService {
    @Autowired
    //llama repository
    private GeneroService GeneroRepository;
    //obtener todo
    public List<Genero> getGenero(){
        return GeneroRepository.obtenergenero(id_genero);
    }
    //buscar x id_genero
    public Genero getGenero(){
        return GeneroRepository.buscarGenero(id_genero);
    }
    //eliminar x id_gemero
    public int delateGenero(int id_genero){
        return GeneroRepository.eliminarGenero(id_genero);
    }
    //guardar genero
    public Genero saveGenero(Genero genero){
        return GeneroRepository.guardarGenero(genero);
    }
    //modificar genero 
    public int updateGenero(Genero genero){
        return GeneroRepository.modificarGenero(genero); 


    }




}
s