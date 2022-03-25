java-chess 기능 요구사항

## 1단계

1. 게임 상태 생성
2. 채스판 초기화
    1. 가로 위치 a~h (왼쪽부터 오른쪽)
    2. 세로 위치 1~8 (아래부터 위)
3. 각 진영은 대소문자로 구별(대문자-흑, 소문자-백)

## 2단계

1. 기물이 이동할 위치를 입력받는다.
    - 입력 형식은 {source위치} {target위치} 이다.
        - 위의 입력 형식과 다른 형식이 입력되면 예외 발생.
        - source 위치와 target 위치가 동일한 경우 예외 발생.
    - 자신의 턴이 아닌 기물을 입력하는 경우 예외 발생.
    - 입력이 체스판의 범위를 벗어난 경우 예외 발생.
    - 해당 위치에 기물이 존재하지 않는 경우 예외 발생.
    - 해당 기물의 특성상 움직일 수 있는 위치가 아닌 경우 예외 발생.
    - 이동하려는 위치 중간에 기물이 존재하는 경우 예외 발생.


2. 이동이 완료된 체스판을 출력한다.

## 3단계

1. King이 잡히는 경우 게임이 종료된다.
2. status 명령어를 입력하면 각 진영의 점수를 출력한다.
    - 각 말의 점수는 queen은 9점, rook은 5점, bishop은 3점, knight는 2.5점이다.
    - pawn의 기본 점수는 1점이다. 하지만 같은 세로줄에 같은 색의 폰이 있는 경우 1점이 아닌 0.5점을 준다.
    - king은 잡히는 경우 경기가 끝나기 때문에 점수가 없다.

## 체스 기물 규칙

1. Bishop (대각선)
2. Rook (상하좌우 직선)
3. Knight (현재좌표 (1,2) (2,1) (2,-1) (1,-2) (-1,-2) (-2,-1) (-2,1) (-1,2))
4. Queen (상하좌우 + 대각선)
5. Pawn (상대 진영 방향(초기 위치인 경우 1칸 or 2칸, 그 외 1칸), 상대 기물을 잡아야 하는 경우 대각선 1칸)
6. King (현재 위치를 기준으로 상하좌우, 대각선 1칸)
