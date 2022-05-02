/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542408
 */
public class Regular {
    Pattern p = Pattern.compile("(cat)|(dog)");
    Matcher m = p.matcher("one cat is equal to one girl");
}
