  mov 1234, R0
  call reverse
  stop
; ������������ ����� R0 
; � �������� �������
;-----------------------
reverse:
  push R1
  push R2
  mov 10, R2
  xor R1, R1
next-bit:
  rcl 1, R0
  rcr 1, R1
  sub 1, R2
  jnz next-bit
  mov R1, R0
  pop R2
  pop R1
  ret


