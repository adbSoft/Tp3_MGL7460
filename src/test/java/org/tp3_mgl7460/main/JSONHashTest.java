/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tp3_mgl7460.main;

import org.tp3_mgl7460.file.JSONHash;
import java.io.IOException;
import java.util.ArrayList;
import net.sf.json.JSONException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.tp3_mgl7460.file.FormationContinueException;

/**
 *
 * @author sergedelil
 */
public class JSONHashTest {
    
    boolean thrown;
    String input;
    String badInput;
    String output;
    JSONHash jsonHash;
    JSONHash obj;
    
    ArrayList<String> liste;
    
    @Before
    public void setUp() {
        input = "resources/input.json";
        badInput = "";
        output = "resources/output.json";
        obj = new JSONHash(badInput);
        jsonHash = new JSONHash(input);
        thrown = false;
        
        liste = new ArrayList();
        liste.add(input);
        liste.add(badInput);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testLoad() throws Exception {
        try {
          thrown = obj.load();
        } catch (IOException | JSONException | FormationContinueException e) {
          thrown = true;
        }
        assertTrue(thrown);
    }
    
    @Test
    public void testLoad_1() throws Exception {
        assertTrue(jsonHash.load());
    }
    
    @Test
    public void testSave() throws IOException, FormationContinueException{
        assertTrue(jsonHash.save(output, thrown, liste));
    }
    
    @Test
    public void testSave_1() throws Exception {
        try {
          assertTrue(jsonHash.save(output, thrown, liste));
        } catch (IOException | FormationContinueException e) {
          thrown = true;
        }
        assertFalse(thrown);
    }
}
