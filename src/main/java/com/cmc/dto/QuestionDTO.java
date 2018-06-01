package com.cmc.dto;

public class QuestionDTO{
    private int saving;
    private int loan;
	public int getSaving() {
		return saving;
	}
	public void setSaving(int saving) {
		this.saving = saving;
	}
	public int getLoan() {
		return loan;
	}
	public void setLoan(int loan) {
		this.loan = loan;
	}
	public QuestionDTO(int saving, int loan) {
		super();
		this.saving = saving;
		this.loan = loan;
	}
	public QuestionDTO() {
		super();
	}

   
}
