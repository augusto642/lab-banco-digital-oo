/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package com.banco;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class AgenciaTest {

    public AgenciaTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of adicionarConta method, of class Agencia.
     */
    @org.junit.Test
    public void testAdicionarConta() {
        System.out.println("adicionarConta");
        Conta conta = null;
        Agencia instance = null;
        instance.adicionarConta(conta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarClientes method, of class Agencia.
     */
    @org.junit.Test
    public void testListarClientes() {
        System.out.println("listarClientes");
        Agencia instance = null;
        List<String> expResult = null;
        List<String> result = instance.listarClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Agencia.
     */
    @org.junit.Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Agencia instance = null;
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContas method, of class Agencia.
     */
    @org.junit.Test
    public void testGetContas() {
        System.out.println("getContas");
        Agencia instance = null;
        List<Conta> expResult = null;
        List<Conta> result = instance.getContas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Agencia.
     */
    @org.junit.Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Agencia instance = null;
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContas method, of class Agencia.
     */
    @org.junit.Test
    public void testSetContas() {
        System.out.println("setContas");
        List<Conta> contas = null;
        Agencia instance = null;
        instance.setContas(contas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}