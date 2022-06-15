package com.crud.democrud.ControllerServiceTest;

import com.crud.democrud.controllers.UsuarioController;
import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.repositories.UsuarioRepository;
import com.crud.democrud.services.UsuarioService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
public class UsuarioServiceMockTest {

  @MockBean
  UsuarioRepository usuarioRepository;

  @Autowired
  UsuarioService usuarioService;

  @Test
  public void testUsuarioMock(){
    when(usuarioRepository.findAll()).thenReturn(new ArrayList<>());
    assertThat(usuarioService.obtenerUsuarios()).isEmpty();
    verify(usuarioRepository).findAll();
  }

}
