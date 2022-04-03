java-chess 기능 요구사항

## 1단계

1. 게임 상태를 생성한다.
2. "start"를 입력하면 체스 게임을 시작한다.
3. 체스판을 초기화한다.
    - 가로 위치 a~h (왼쪽부터 오른쪽)
    - 세로 위치 1~8 (아래부터 위)
    - 각 진영은 대소문자로 구별 (대문자-흑, 소문자-백)
4. "end"를 입력하면 체스게임을 종료한다.
5. 허용되지 않은 명령어를 입력하는 경우 예외가 발생한다.

## 2단계

1. 기물이 이동할 위치를 입력받는다.
    - 입력 형식은 {source위치} {target위치} 이다.
        - 위의 입력 형식과 다른 형식이 입력되면 예외가 발생한다.
        - source 위치와 target 위치가 동일한 경우 예외가 발생한다.
    - 자신의 턴이 아닌 기물을 입력하는 경우 예외가 발생한다.
    - 같은 편의 기물을 잡으려는 경우 예외가 발생한다.
    - 입력이 체스판의 범위를 벗어난 경우 예외가 발생한다.
    - 해당 위치에 기물이 존재하지 않는 경우 예외가 발생한다.
    - 해당 기물의 특성상 움직일 수 있는 위치가 아닌 경우 예외가 발생한다.
    - 이동하려는 위치 중간에 기물이 존재하는 경우 예외가 발생한다.
2. 기물을 이동한다.
3. 이동이 완료된 체스판을 출력한다.

## 3단계

1. King이 잡히는 경우 게임이 종료된다.
2. "status"를 입력하면 각 진영의 점수와 결과를 출력한다.
    - 각 기물의 점수는 queen은 9점, rook은 5점, bishop은 3점, knight는 2.5점이다.
    - pawn의 기본 점수는 1점이다. 하지만 같은 세로줄에 같은 색의 폰이 있는 경우 1점이 아닌 0.5점으로 계산한다.
    - king은 잡히는 경우 경기가 끝나기 때문에 0점으로 계산한다.

## 4단계

1. 웹으로 체스게임이 가능하다.
2. "시작" 버튼을 클릭하면 체스판이 초기화된다.
3. "종료" 버튼을 클릭하면 게임이 종료된다.
4. "점수" 버튼을 클릭하면 현재 점수가 출력된다.
5. 움직일 말의 위치와 움직일 위치를 입력하고 "이동" 버튼을 입력하면 기물이 이동된다.
6. 예외가 발생한 경우 화면에 에러 메시지가 출력된다.

## 5단계

1. 사용자의 이름을 입력하면 게임이 시작된다.
2. 이전에 진행하던 게임이 있다면 해당 게임이, 그렇지 않다면 새로운 게임이 시작된다.
3. 웹 서버를 재시작하더라도 이전에 하던 체스 게임을 다시 시작할 수 있다.

## 체스 기물 규칙

1. Bishop (대각선)
2. Rook (상하좌우 직선)
3. Knight (현재좌표기준 (1,2) (2,1) (2,-1) (1,-2) (-1,-2) (-2,-1) (-2,1) (-1,2))
4. Queen (상하좌우 + 대각선)
5. Pawn (상대 진영 방향(초기 위치인 경우 1칸 or 2칸, 그 외 1칸), 상대 기물을 잡아야 하는 경우 대각선 1칸)
6. King (현재 위치를 기준으로 상하좌우, 대각선 1칸)
