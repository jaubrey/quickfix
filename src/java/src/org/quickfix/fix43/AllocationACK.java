package org.quickfix.fix43; 
import org.quickfix.FieldNotFound; 
import org.quickfix.Group; 
import org.quickfix.field.*; 

public class AllocationACK extends Message 
{ 

  public AllocationACK() 
  { 
    getHeader().setField(new MsgType("P")); 
  } 
  public AllocationACK(    
    org.quickfix.field.AllocID aAllocID,    
    org.quickfix.field.TradeDate aTradeDate,    
    org.quickfix.field.AllocStatus aAllocStatus ) 
  {  
    getHeader().setField(new MsgType("P")); 
    set(aAllocID); 
    set(aTradeDate); 
    set(aAllocStatus);  
  } 

  public void set(org.quickfix.field.AllocID value) 
  { setField(value); } 
  public org.quickfix.field.AllocID get(org.quickfix.field.AllocID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.AllocID getAllocID() throws FieldNotFound 
  { org.quickfix.field.AllocID value = new org.quickfix.field.AllocID(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.TradeDate value) 
  { setField(value); } 
  public org.quickfix.field.TradeDate get(org.quickfix.field.TradeDate value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.TradeDate getTradeDate() throws FieldNotFound 
  { org.quickfix.field.TradeDate value = new org.quickfix.field.TradeDate(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.TransactTime value) 
  { setField(value); } 
  public org.quickfix.field.TransactTime get(org.quickfix.field.TransactTime value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.TransactTime getTransactTime() throws FieldNotFound 
  { org.quickfix.field.TransactTime value = new org.quickfix.field.TransactTime(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.AllocStatus value) 
  { setField(value); } 
  public org.quickfix.field.AllocStatus get(org.quickfix.field.AllocStatus value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.AllocStatus getAllocStatus() throws FieldNotFound 
  { org.quickfix.field.AllocStatus value = new org.quickfix.field.AllocStatus(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.AllocRejCode value) 
  { setField(value); } 
  public org.quickfix.field.AllocRejCode get(org.quickfix.field.AllocRejCode value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.AllocRejCode getAllocRejCode() throws FieldNotFound 
  { org.quickfix.field.AllocRejCode value = new org.quickfix.field.AllocRejCode(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.Text value) 
  { setField(value); } 
  public org.quickfix.field.Text get(org.quickfix.field.Text value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.Text getText() throws FieldNotFound 
  { org.quickfix.field.Text value = new org.quickfix.field.Text(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.EncodedTextLen value) 
  { setField(value); } 
  public org.quickfix.field.EncodedTextLen get(org.quickfix.field.EncodedTextLen value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound 
  { org.quickfix.field.EncodedTextLen value = new org.quickfix.field.EncodedTextLen(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.EncodedText value) 
  { setField(value); } 
  public org.quickfix.field.EncodedText get(org.quickfix.field.EncodedText value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.EncodedText getEncodedText() throws FieldNotFound 
  { org.quickfix.field.EncodedText value = new org.quickfix.field.EncodedText(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.LegalConfirm value) 
  { setField(value); } 
  public org.quickfix.field.LegalConfirm get(org.quickfix.field.LegalConfirm value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.LegalConfirm getLegalConfirm() throws FieldNotFound 
  { org.quickfix.field.LegalConfirm value = new org.quickfix.field.LegalConfirm(); 
    getField(value); return value; } 
} 